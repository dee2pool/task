package com.hngd.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.google.gson.JsonElement;
/**
 * 任务
 * @author Administrator
 *
 */
public class TaskPo {
	//任务id
	private String taskId;
	//任务名称
	@NotNull
	private String taskName;
	//优先级(数值越大优先级越低默认为100)
	private Integer priority=100;
	//提交的节点(默认为test_jobClient)
	private String submitNodeGroup="test_jobClient";
	//执行的节点(默认为test_trade_TaskTracker)
	private String taskTrackerNodeGroup="test_trade_TaskTracker";
	//执行任务的设备(json数组)
	@NotNull
	private List<Map<String,String>> taskDevice;
	//最大重试次数(默认为0)
	private Integer maxRetryTimes=0;
	//cron表达式
	private String cronTemplet;
	//触发时间
	private Date triggerTime;
	//存在任务是否替换
	private Boolean replaceOnExist=true;
	//是否依赖上个执行周期
	private Boolean relyOnPrevCycle=true;
	//任务类型(1.实时2.定时3.周期)
	private Integer jobType;
	//执行业务名称
	@NotNull
	private String taskType;
	//提交结果
	private String submitResult;
	//执行结果
	private String executeResult;
	//完成时间
	private Date endTime;
	//任务运行次数	
	private Integer runCount;
	//任务失败次数
	private Integer faileCount;
	//提交的业务额外参数
	private Map<String,String> submitParam;
	//备注
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

	public String getSubmitNodeGroup() {
		return submitNodeGroup;
	}

	public void setSubmitNodeGroup(String submitNodeGroup) {
		this.submitNodeGroup = submitNodeGroup;
	}

	public String getTaskTrackerNodeGroup() {
		return taskTrackerNodeGroup;
	}

	public void setTaskTrackerNodeGroup(String taskTrackerNodeGroup) {
		this.taskTrackerNodeGroup = taskTrackerNodeGroup;
	}

	

	public Integer getMaxRetryTimes() {
		return maxRetryTimes;
	}

	public void setMaxRetryTimes(Integer maxRetryTimes) {
		this.maxRetryTimes = maxRetryTimes;
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

	public Boolean getReplaceOnExist() {
		return replaceOnExist;
	}

	public void setReplaceOnExist(Boolean replaceOnExist) {
		this.replaceOnExist = replaceOnExist;
	}

	public Boolean getRelyOnPrevCycle() {
		return relyOnPrevCycle;
	}

	public void setRelyOnPrevCycle(Boolean relyOnPrevCycle) {
		this.relyOnPrevCycle = relyOnPrevCycle;
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
	
	public List<Map<String, String>> getTaskDevice() {
		return taskDevice;
	}

	public void setTaskDevice(List<Map<String, String>> taskDevice) {
		this.taskDevice = taskDevice;
	}

	public Map<String, String> getSubmitParam() {
		return submitParam;
	}

	public void setSubmitParam(Map<String, String> submitParam) {
		this.submitParam = submitParam;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
