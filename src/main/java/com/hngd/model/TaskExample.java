package com.hngd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskExample {
	
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;
	
	public TaskExample() {
        oredCriteria = new ArrayList<Criteria>();
    }
	
	public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }
	
	public String getOrderByClause() {
        return orderByClause;
    }
	
	public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }
	
	public boolean isDistinct() {
        return distinct;
    }
	
	public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }
	
	public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }
	
	public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }
	
	public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }
	
	protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }
	
	public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }
	
	protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("task_id like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("task_id not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }
        public Criteria andTaskTypeIsNull() {
            addCriterion("task_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("task_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("task_type =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("task_type <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("task_type like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("task_type not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("task_type in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("task_type not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("task_type between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("task_type not between", value1, value2, "taskType");
            return (Criteria) this;
        }
        public Criteria andJobTypeIsNull() {
            addCriterion("job_type is null");
            return (Criteria) this;
        }

        public Criteria andJobTypeIsNotNull() {
            addCriterion("job_type is not null");
            return (Criteria) this;
        }

        public Criteria andJobTypeEqualTo(String value) {
            addCriterion("job_type =", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotEqualTo(String value) {
            addCriterion("job_type <>", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLike(String value) {
            addCriterion("job_type like", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotLike(String value) {
            addCriterion("job_type not like", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeIn(List<String> values) {
            addCriterion("job_type in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotIn(List<String> values) {
            addCriterion("job_type not in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeBetween(String value1, String value2) {
            addCriterion("job_type between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotBetween(String value1, String value2) {
            addCriterion("job_type not between", value1, value2, "jobType");
            return (Criteria) this;
        }
        public Criteria andSubmitResultIsNull() {
            addCriterion("submit_result is null");
            return (Criteria) this;
        }

        public Criteria andSubmitResultIsNotNull() {
            addCriterion("submit_result is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitResultEqualTo(String value) {
            addCriterion("submit_result =", value, "submitResult");
            return (Criteria) this;
        }

        public Criteria andSubmitResultNotEqualTo(String value) {
            addCriterion("submit_result <>", value, "submitResult");
            return (Criteria) this;
        }

        public Criteria andSubmitResultLike(String value) {
            addCriterion("submit_result like", value, "submitResult");
            return (Criteria) this;
        }

        public Criteria andSubmitResultNotLike(String value) {
            addCriterion("submit_result not like", value, "submitResult");
            return (Criteria) this;
        }

        public Criteria andSubmitResultIn(List<String> values) {
            addCriterion("submit_result in", values, "submitResult");
            return (Criteria) this;
        }

        public Criteria andSubmitResultNotIn(List<String> values) {
            addCriterion("submit_result not in", values, "submitResult");
            return (Criteria) this;
        }

        public Criteria andSubmitResultBetween(String value1, String value2) {
            addCriterion("submit_result between", value1, value2, "submitResult");
            return (Criteria) this;
        }

        public Criteria andSubmitResultNotBetween(String value1, String value2) {
            addCriterion("submit_result not between", value1, value2, "submitResult");
            return (Criteria) this;
        }
        public Criteria andExecuteResultIsNull() {
            addCriterion("execute_result is null");
            return (Criteria) this;
        }

        public Criteria andExecuteResultIsNotNull() {
            addCriterion("execute_result is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteResultEqualTo(String value) {
            addCriterion("execute_result =", value, "executeResult");
            return (Criteria) this;
        }

        public Criteria andExecuteResultNotEqualTo(String value) {
            addCriterion("execute_result <>", value, "executeResult");
            return (Criteria) this;
        }

        public Criteria andExecuteResultLike(String value) {
            addCriterion("execute_result like", value, "executeResult");
            return (Criteria) this;
        }

        public Criteria andExecuteResultNotLike(String value) {
            addCriterion("execute_result not like", value, "executeResult");
            return (Criteria) this;
        }

        public Criteria andExecuteResultIn(List<String> values) {
            addCriterion("execute_result in", values, "executeResult");
            return (Criteria) this;
        }

        public Criteria andExecuteResultNotIn(List<String> values) {
            addCriterion("execute_result not in", values, "executeResult");
            return (Criteria) this;
        }

        public Criteria andExecuteResultBetween(String value1, String value2) {
            addCriterion("execute_result between", value1, value2, "executeResult");
            return (Criteria) this;
        }

        public Criteria andExecuteResultNotBetween(String value1, String value2) {
            addCriterion("execute_result not between", value1, value2, "executeResult");
            return (Criteria) this;
        }
        public Criteria andTriggerTimeIsNull() {
            addCriterion("trigger_time is null");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeIsNotNull() {
            addCriterion("trigger_time is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeEqualTo(Date value) {
            addCriterion("trigger_time =", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeNotEqualTo(Date value) {
            addCriterion("trigger_time <>", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeLike(Date value) {
            addCriterion("trigger_time like", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeNotLike(Date value) {
            addCriterion("trigger_time not like", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeIn(List<Date> values) {
            addCriterion("trigger_time in", values, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeNotIn(List<Date> values) {
            addCriterion("trigger_time not in", values, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeBetween(Date value1, Date value2) {
            addCriterion("trigger_time between", value1, value2, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeNotBetween(Date value1, Date value2) {
            addCriterion("trigger_time not between", value1, value2, "triggerTime");
            return (Criteria) this;
        }
    }
	
	public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
	
	public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
