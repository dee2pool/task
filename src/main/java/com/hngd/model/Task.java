package com.hngd.model;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

/**
 * 任务
 */
public class Task{
	//任务id
	public String taskId;
	
	//任务名称
	@NotNull
	public String taskName;
	
	//优先级(数值越大优先级越低)
	private Integer priority;
	
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
    
    //设备信息(存储json信息)
    private List<String> deviceInfos;
    
    //额外服务参数(存储json信息)
    private String serviceParam;
    
    //备注
    private String remark;

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

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
	
	
	public List<String> getDeviceInfos() {
		return deviceInfos;
	}

	public void setDeviceInfos(List<String> deviceInfos) {
		this.deviceInfos = deviceInfos;
	}

	public String getServiceParam() {
		return serviceParam;
	}

	public void setServiceParam(String serviceParam) {
		this.serviceParam = serviceParam;
	}
	
	
}