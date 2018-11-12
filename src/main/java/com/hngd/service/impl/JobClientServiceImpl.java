package com.hngd.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hngd.common.result.Result;
import com.hngd.model.Job;
import com.hngd.service.JobClientService;

public class JobClientServiceImpl implements JobClientService{
	private static final Logger logger = LoggerFactory.getLogger(JobClientService.class);

	@Override
	public Result<String> addJob(Job job) {
		
		//生成task_id
		//判断任务类型
		//如果是实时任务，调用lts提交任务，接收结果并设置提交结果，设置执行结果为等待执行并保存到数据库中
		//如果是定时任务，调用lts提交任务，接收结果并设置提交结果，设置执行结果为等待执行并保存到数据库中
		//如果是周期任务，调用lts提交任务，接收结果并设置提交结果，设置执行结果为等待执行并保存到数据库中
		return null;
	}
	
}
