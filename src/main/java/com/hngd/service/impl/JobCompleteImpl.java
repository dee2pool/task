package com.hngd.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.ltsopensource.core.commons.utils.CollectionUtils;
import com.github.ltsopensource.core.commons.utils.StringUtils;
import com.github.ltsopensource.core.domain.Job;
import com.github.ltsopensource.core.domain.JobResult;
import com.github.ltsopensource.jobclient.support.JobCompletedHandler;
import com.github.ltsopensource.spring.boot.annotation.JobCompletedHandler4JobClient;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.hngd.dao.JobMapper;
import com.hngd.model.TaskPo;

@JobCompletedHandler4JobClient
public class JobCompleteImpl implements JobCompletedHandler{
	
	/*@Autowired
	private TaskPo taskPo;
	
	@Autowired
	private JobMapper jobMapper;*/
	
	private static final JsonParser jsonParser=new JsonParser();
	
	@Override
	public void onComplete(List<JobResult> jobResults) {
		// 任务执行反馈结果处理
        if (CollectionUtils.isNotEmpty(jobResults)) {
            for (JobResult jobResult : jobResults) {
            	/*//将任务保存到数据库中
            	Job job=jobResult.getJob();
            	taskPo.setTaskId(job.getTaskId());
            	taskPo.setTaskName(job.getExtParams().get("taskName"));
            	taskPo.setPriority(job.getPriority());
            	taskPo.setSubmitNodeGroup(job.getSubmitNodeGroup());
            	taskPo.setTaskTrackerNodeGroup(job.getTaskTrackerNodeGroup());
            	taskPo.setTaskDevice((JsonArray)jsonParser.parse(job.getExtParams().get("deviceInfo")));
            	taskPo.setMaxRetryTimes(job.getMaxRetryTimes());
            	if(!StringUtils.isEmpty(job.getCronExpression())) {
            		taskPo.setCronTemplet(job.getCronExpression());
            	}
            	if(job.getTriggerTime()==null) {
            		//TODO 修改周期任务开始时间
            		taskPo.setTriggerTime(new Date());
            	}*/
            }
        }
		
	}

}
