package com.hngd.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.ltsopensource.core.domain.Job;
import com.github.ltsopensource.jobclient.JobClient;
import com.github.ltsopensource.jobclient.domain.Response;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.hngd.common.error.ErrorCode;
import com.hngd.common.exception.DBErrorException;
import com.hngd.common.result.Result;
import com.hngd.common.result.Results;
import com.hngd.common.util.UuidUtils;
import com.hngd.common.web.page.PageHelper;
import com.hngd.common.web.page.PagedData;
import com.hngd.dao.JobMapper;
import com.hngd.model.Task;
import com.hngd.model.TaskExample;
import com.hngd.model.TaskPo;
import com.hngd.model.TaskVo;
import com.hngd.service.JobClientService;

@Service
public class JobClientServiceImpl implements JobClientService{
	private static final Logger logger = LoggerFactory.getLogger(JobClientService.class);
	
	@Autowired
	private JobClient jobClient;
	
	@Autowired
	private JobMapper jobMapper;
	
	private static final Gson GSON=new Gson();
	
	@Override
	public Result<String> addJob(TaskPo task) {
		String name=task.getTaskName();
		if(existName(name)) {
			return Results.newFailResult(ErrorCode.INVALID_PARAMETER, "任务名已存在");
		}
		task.setTaskId(UuidUtils.uuid());
		//将任务保存到数据库
		int result=jobMapper.insertSelective(task);
		if(result > 0) {
			Job job=new Job();
			job.setTaskId(task.getTaskId());
			job.setPriority(task.getPriority());
			job.setTaskTrackerNodeGroup(task.getTaskTrackerNodeGroup());
			Map<String,String> param=new HashMap<>();
			param.put("jobType",task.getJobType().toString());
			param.put("taskType",task.getTaskType());
			param.put("taskName",task.getTaskName());
			param.put("deviceInfo",GSON.toJson(task.getTaskDevice()));
			param.put("extParam",GSON.toJson(task.getSubmitParam()));
			job.setExtParams(param);
			job.setNeedFeedback(true);
			job.setReplaceOnExist(true);
			//判断任务类型
			if(task.getJobType()!=null) {
				switch (task.getJobType()) {
				case 2:
					job.setTriggerTime(task.getTriggerTime().getTime());
					break;
				case 3:
					job.setCronExpression(task.getCronTemplet());
					break;
				default:
					break;
				}
			}
			//提交任务到lts
			Response response=jobClient.submitJob(job);
			//根据提交结果更新数据库
			TaskPo tp=new TaskPo();
			if(task.getJobType()==1) {
				tp.setTriggerTime(new Date());
			}
			if(response.isSuccess()) {
				tp.setSubmitResult("提交成功");
			}else {
				tp.setSubmitResult("提交失败");
			}
			this.updateBytaskId(task.getTaskId(),tp);
			return Results.newSuccessResult(task.getTaskId());
		}else {
			return Results.newFailResult(ErrorCode.DB_ERROR, "添加任务失败");
		}
	}

	@Override
	public boolean existName(String name) {
		if(StringUtils.isEmpty(name)) {
			return true;
		}
		TaskExample taskExample=new TaskExample();
		TaskExample.Criteria criteria=taskExample.createCriteria();
		criteria.andTaskNameEqualTo(name);
		List<TaskVo> list=jobMapper.selectByExample(taskExample);
		return !CollectionUtils.isEmpty(list);
	}

	@Override
	public Result<PagedData<TaskVo>> getTaskList(Integer pageNo, Integer pageSize, String taskName, String taskType, Integer jobType,
			String submitResult, String executeResult, Date beginTime,Date endTime) {
		
		TaskExample example=new TaskExample();
		TaskExample.Criteria criteria=example.createCriteria();
		if(!StringUtils.isEmpty(taskName)) {
			criteria.andTaskNameLike(taskName);
		}
		if(!StringUtils.isEmpty(taskType)) {
			criteria.andTaskTypeLike(taskType);
		}
		if(jobType!=null) {
			criteria.andJobTypeEqualTo(jobType.toString());
		}
		if(!StringUtils.isEmpty(submitResult)) {
			criteria.andSubmitResultEqualTo(submitResult);
		}
		if(!StringUtils.isEmpty(executeResult)) {
			criteria.andExecuteResultEqualTo(executeResult);
		}
		if(beginTime!=null||endTime!=null) {
			criteria.andTriggerTimeBetween(beginTime, endTime);
		}
		PagedData<TaskVo> p=PageHelper.startPage(pageNo, pageSize);
		p.setResultAndEnd(jobMapper.selectByExample(example));
		return Results.newSuccessResult(p);
	}
	
	public Integer updateBytaskId(String taskId,TaskPo task) {
		if (StringUtils.isEmpty(taskId)){
            logger.debug("the taskId is null" + task);
            return ErrorCode.INVALID_PARAMETER;
        }
		TaskExample example=new TaskExample();
		example.createCriteria().andIdEqualTo(taskId);
		if(jobMapper.updateByExampleSelective(task, example)>0) {
			return ErrorCode.NO_ERROR;
		}else {
			return ErrorCode.DB_ERROR;
		}
	}

	@Override
	public Integer deleteTaskById(String taskId) {
		if(StringUtils.isEmpty(taskId)) {
			logger.debug("the id has no data");
			return ErrorCode.INVALID_PARAMETER;
		}
		int result=jobMapper.deleteByPrimaryKey(taskId);
		if (result > 0){
            return ErrorCode.NO_ERROR;
        } else{
            throw new DBErrorException();
        }
	}

	@Override
	public Result<String> retryTask(String taskId) {
		if(StringUtils.isEmpty(taskId)) {
			logger.debug("the taskId is null");
			return Results.newFailResult(ErrorCode.INVALID_PARAMETER, "任务id不存在");
		}
		TaskPo task=jobMapper.selectByPrimaryKey(taskId);
		if(task==null) {
			return Results.newFailResult(ErrorCode.INVALID_PARAMETER, "任务不存在");
		}else {
			Job job=new Job();
			job.setTaskId(task.getTaskId());
			job.setPriority(task.getPriority());
			job.setTaskTrackerNodeGroup(task.getTaskTrackerNodeGroup());
			Map<String,String> param=new HashMap<>();
			param.put("jobType",task.getJobType().toString());
			param.put("taskType",task.getTaskType());
			param.put("taskName",task.getTaskName());
			param.put("deviceInfo",GSON.toJson(task.getTaskDevice()));
			param.put("extParam",GSON.toJson(task.getSubmitParam()));
			job.setExtParams(param);
			job.setNeedFeedback(true);
			job.setReplaceOnExist(true);
			//判断任务类型
			if(task.getJobType()!=null) {
				switch (task.getJobType()) {
				case 2:
					job.setTriggerTime(task.getTriggerTime().getTime());
					break;
				case 3:
					job.setCronExpression(task.getCronTemplet());
					break;
				default:
					break;
				}
			}
			//提交任务到lts
			Response response=jobClient.submitJob(job);
			if(response.isSuccess()) {
				return Results.newSuccessResult(task.getTaskId());
			}else {
				return Results.newFailResult(ErrorCode.DB_ERROR, "重试任务失败");
			}
		}
	}
}
