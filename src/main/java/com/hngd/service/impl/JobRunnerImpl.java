package com.hngd.service.impl;

import java.util.List;
import java.util.Map;

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
import com.hngd.rpc.dg.CommonResponse;

@JobRunner4TaskTracker
public class JobRunnerImpl implements JobRunner{
	private static final Logger LOGGER = LoggerFactory.getLogger(JobRunnerImpl.class);
	
	private static final String HOST="192.168.0.157";
	
	private static final Gson GSON=new Gson();
	
	private static final int PORT=60051;
	
	@Override
	public Result run(JobContext jobContext) throws Throwable {
		
		try {
            BizLogger bizLogger = jobContext.getBizLogger();
            // TODO 业务逻辑
            LOGGER.info("我要执行：" + jobContext);
            Job job=jobContext.getJob();
            String deviceJson=job.getExtParams().get("deviceInfo");
            String subParamJson=job.getExtParams().get("extParam");
            List<Map<String,String>> devices=GSON.fromJson(deviceJson,new TypeToken<List<Map<String,String>>>(){}.getType());
            Map<String,String> subParam=GSON.fromJson(subParamJson,Map.class);
            TaskClient client=new TaskClient(HOST, PORT);
            for(Map m:devices) {
            	CommonResponse response=client.QueryFileOperation(m,subParam,job.getTaskId());
            	
            }
            // 会发送到 LTS (JobTracker上)
            bizLogger.info("测试，业务日志");

        } catch (Exception e) {
            LOGGER.info("Run job failed!", e);
            return new Result(Action.EXECUTE_FAILED, e.getMessage());
        }
        return new Result(Action.EXECUTE_SUCCESS, "执行成功");
	}

}
