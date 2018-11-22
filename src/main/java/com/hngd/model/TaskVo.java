package com.hngd.model;

import java.util.Date;

import com.google.gson.JsonElement;

public class TaskVo {
	private String taskId;
	
	private String taskName;
	
	private Integer priority;
	
	private String cronTemplet;
	
	private Date triggerTime;
	
	private Integer jobType;
	
	private String taskType;

	private String submitResult;
	
	private String executeResult;
	
	private Date endTime;
	
	private Integer runCount;
	
	private Integer faileCount;
	
	private String remarks;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getCronTemplet() {
		return cronTemplet;
	}

	public void setCronTemplet(String cronTemplet) {
		this.cronTemplet = cronTemplet;
	}

	public Date getTriggerTime() {
		return triggerTime;
	}

	public void setTriggerTime(Date triggerTime) {
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

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getRunCount() {
		return runCount;
	}

	public void setRunCount(Integer runCount) {
		this.runCount = runCount;
	}

	public Integer getFaileCount() {
		return faileCount;
	}

	public void setFaileCount(Integer faileCount) {
		this.faileCount = faileCount;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
}
