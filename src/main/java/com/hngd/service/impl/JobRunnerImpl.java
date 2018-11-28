package com.hngd.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.ltsopensource.core.domain.Action;
import com.github.ltsopensource.core.domain.Job;
import com.github.ltsopensource.core.logger.Logger;
import com.github.ltsopensource.core.logger.LoggerFactory;
import com.github.ltsopensource.spring.boot.annotation.JobRunner4TaskTracker;
import com.github.ltsopensource.tasktracker.Result;
import com.github.ltsopensource.tasktracker.logger.BizLogger;
import com.github.ltsopensource.tasktracker.runner.JobContext;
import com.github.ltsopensource.tasktracker.runner.JobRunner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hngd.client.TaskClient;
import com.hngd.common.util.UuidUtils;
import com.hngd.model.TaskPo;
import com.hngd.rpc.dg.CommonResponse;
import com.hngd.service.JobClientService;

@JobRunner4TaskTracker
public class JobRunnerImpl implements JobRunner{
	private static final Logger LOGGER = LoggerFactory.getLogger(JobRunnerImpl.class);
	
	private static final String HOST="192.168.0.157";
	
	private static final Gson GSON=new Gson();
	
	private static final int PORT=60051;
	
	@Autowired
	private JobClientService jobClientService;
	
	@Override
	public Result run(JobContext jobContext) throws Throwable {
		TaskPo taskPo=new TaskPo();
		 List<Map<String,String>> deviceResultList=new ArrayList<>();
         Map<String,String> deviceResult=new HashMap<>();
         Job job=null;
		try {
            BizLogger bizLogger = jobContext.getBizLogger();
            // TODO 业务逻辑
            LOGGER.info("我要执行：" + jobContext);
            job=jobContext.getJob();
            String deviceJson=job.getExtParams().get("deviceInfo");
            String subParamJson=job.getExtParams().get("extParam");
            List<Map<String,String>> devices=GSON.fromJson(deviceJson,new TypeToken<List<Map<String,String>>>(){}.getType());
            Map<String,String> subParam=GSON.fromJson(subParamJson,Map.class);
            TaskClient client=new TaskClient(HOST, PORT);
            for(Map m:devices) {
            	CommonResponse response=client.QueryFileOperation(m,subParam,UuidUtils.uuid());;
            	//if(StringUtils.isEmpty(job.getCronExpression())) {
            	//}else {
            		//int perSecs=0;
            		//switch (job.getCronExpression()) {
					//case "*/10 * * * * ?":
						//perSecs=10;
						//break;
					//case "*/30 * * * * ?":
						//perSecs=30;
						//break;
					//default:
						//break;
					//}
            		 //response=client.PeriodicTaskConfig(m,subParam,perSecs,job.getTaskId());
            		 //taskPo.setTriggerTime(new Date());
            	//}
            	if(response!=null) {
            		switch (response.getErrorCode()) {
    				case OK:
    					//TODO fix
    					deviceResult.put(m.get("deviceName").toString(),"查询成功");
    					break;
    				case FAILED:
    					deviceResult.put(m.get("deviceName").toString(),"查询失败("+response.getDescription()+")");
    					break;
    				default:
    					break;
    				}
            		taskPo.setFaileCount(0);
            	}else {
            		deviceResult.put(m.get("deviceName").toString(),"查询失败 设备网关通信异常");
            		taskPo.setFaileCount(1);
            	}
            }
            deviceResultList.add(deviceResult);
            // 会发送到 LTS (JobTracker上)
            taskPo.setTriggerTime(new Date());
            taskPo.setRunCount(1);
            bizLogger.info("测试，业务日志");
        } catch (Exception e) {
            LOGGER.info("Run job failed!", e);
            taskPo.setFaileCount(1);
            return new Result(Action.EXECUTE_FAILED, e.getMessage());
        }
		 taskPo.setExecuteResult(GSON.toJson(deviceResultList));
         taskPo.setEndTime(new Date());
         jobClientService.updateBytaskId(job.getTaskId(),taskPo);
        return new Result(Action.EXECUTE_SUCCESS, "执行成功");
	}

}
