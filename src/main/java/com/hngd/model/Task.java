package com.hngd.model;

import java.util.Map;

import javax.validation.constraints.NotNull;

/**
 * 任务
 */
public class Task{
	//任务id
	public String taskId;
	
	//优先级(数值越大优先级越低)
	private Integer priority;
    
    //提交结果
    private String submitResult;
    
    //任务执行结果
    private String executeResult;
    /**
     * 执行表达式 和 quartz 的一样
     * 如果这个为空，表示立即执行的
     */
    private String cronExpression;
    /**
     * 任务的触发时间
     * 如果设置了 cronExpression， 那么这个字段没用
     */
    private Long triggerTime;
    
    //任务类型:1.实时、2.定时、3.周期
    private Integer jobType;
    
    //具体执行哪个服务例如:录像文件查询
    private String taskType;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getSubmitResult() {
		return submitResult;
	}

	public void setSubmitResult(String submitResult) {
		this.submitResult = submitResult;
	}

	public String getExecuteResult() {
		return executeResult;
	}

	public void setExecuteResult(String executeResult) {
		this.executeResult = executeResult;
	}

	public String getCronExpression() {
		return cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public Long getTriggerTime() {
		return triggerTime;
	}

	public void setTriggerTime(Long triggerTime) {
		this.triggerTime = triggerTime;
	}

	public Integer getJobType() {
		return jobType;
	}

	public void setJobType(Integer jobType) {
		this.jobType = jobType;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
    
    
    
    
}
