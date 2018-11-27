package com.hngd.service;

import java.util.Date;
import java.util.List;

import com.hngd.common.result.Result;
import com.hngd.common.web.page.PagedData;
import com.hngd.model.Task;
import com.hngd.model.TaskPo;
import com.hngd.model.TaskVo;

public interface JobClientService {
	//添加任务
	public Result<String> addJob(TaskPo task);
	
	public boolean existName(String name);
	
	public Result<PagedData<TaskVo>> getTaskList(Integer pageNo,Integer pageSize,String taskName,
									String taskType,Integer jobType,String submitResult,String executeResult,Date beginTime,Date endTime);
	
	public Integer updateBytaskId(String taskId,TaskPo task);
	
	//删除任务
	public Integer deleteTaskById(String taskId);
	
	//重试任务
	public Result<String> retryTask(String taskId);
}
