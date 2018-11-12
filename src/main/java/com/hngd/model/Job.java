package com.hngd.model;

import java.util.Map;

import javax.validation.constraints.NotNull;

/**
 * @author fch
 * 任务
 */
public class Job {
	//任务id
	@NotNull
	public String taskId;
	
	//优先级(数值越大优先级越低)
	private Integer priority = 100;
	
    // 提交的节点 （可以手动指定）
    private String submitNodeGroup;
    
    // 执行的节点
    @NotNull
    private String taskTrackerNodeGroup;
    
    //提交结果
    private String submitResult;
    
    //任务执行结果
    private String executeResult;
    
    // 是否要反馈给客户端
    private boolean needFeedback = false;
    
    // 该任务最大的重试次数
    private int maxRetryTimes = 0;
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
    /**
     * 当任务队列中存在这个任务的时候，是否替换更新
     */
    private boolean replaceOnExist = false;
    /**
     * 是否依赖上一个执行周期(对于周期性任务才起作用)
     */
    private boolean relyOnPrevCycle = true;
    
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

	public boolean isNeedFeedback() {
		return needFeedback;
	}

	public void setNeedFeedback(boolean needFeedback) {
		this.needFeedback = needFeedback;
	}

	public int getMaxRetryTimes() {
		return maxRetryTimes;
	}

	public void setMaxRetryTimes(int maxRetryTimes) {
		this.maxRetryTimes = maxRetryTimes;
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

	public boolean isReplaceOnExist() {
		return replaceOnExist;
	}

	public void setReplaceOnExist(boolean replaceOnExist) {
		this.replaceOnExist = replaceOnExist;
	}

	public boolean isRelyOnPrevCycle() {
		return relyOnPrevCycle;
	}

	public void setRelyOnPrevCycle(boolean relyOnPrevCycle) {
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
}
