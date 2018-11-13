package com.hngd.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.github.ltsopensource.core.domain.Job;
import com.github.ltsopensource.jobclient.JobClient;
import com.github.ltsopensource.jobclient.domain.Response;
import com.hngd.common.result.Result;
import com.hngd.common.util.UuidUtils;
import com.hngd.model.Task;
import com.hngd.service.JobClientService;

@Service
public class JobClientServiceImpl implements JobClientService{
	private static final Logger logger = LoggerFactory.getLogger(JobClientService.class);
	
	@Autowired
	private JobClient jobClient;
	
	@Override
	public Result<String> addJob(Task task) {
		
		//生成task_id
		task.setTaskId(UuidUtils.uuid());
		Job job=new Job();
		job.setTaskId(task.getTaskId());
		if(task.getPriority()!=null) {
			job.setPriority(task.getPriority());
		}
		job.setTaskTrackerNodeGroup("test_trade_TaskTracker");
		Map<String,String> param=new HashMap<>();
		param.put("taskType",task.getTaskType());
		job.setNeedFeedback(true);
		job.setReplaceOnExist(true);
		//判断任务类型
		if(task.getJobType()!=null) {
			switch (task.getJobType()) {
			case 1:
				//如果是实时任务，调用lts提交任务，接收结果并设置提交结果，设置执行结果为等待执行并保存到数据库中
				param.put("jobType","实时任务");
				job.setExtParams(param);
				break;
			case 2:
				//如果是定时任务，调用lts提交任务，接收结果并设置提交结果，设置执行结果为等待执行并保存到数据库中
				param.put("jobType","定时任务");
				job.setExtParams(param);
				job.setTriggerTime(task.getTriggerTime());
				break;
			case 3:
				//如果是周期任务，调用lts提交任务，接收结果并设置提交结果，设置执行结果为等待执行并保存到数据库中
				param.put("jobType","周期任务");
				job.setExtParams(param);
				job.setCronExpression(task.getCronExpression());
				break;
			default:
				break;
			}
		}
		Response response=jobClient.submitJob(job);
		System.out.println("response"+response);
		//TODO 提取结果分析
		//TODO 将task加入数据库中
		return null;
	}
	
}
