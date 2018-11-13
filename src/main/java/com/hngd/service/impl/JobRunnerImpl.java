package com.hngd.service.impl;

import com.github.ltsopensource.core.domain.Action;
import com.github.ltsopensource.core.logger.Logger;
import com.github.ltsopensource.core.logger.LoggerFactory;
import com.github.ltsopensource.spring.boot.annotation.JobRunner4TaskTracker;
import com.github.ltsopensource.tasktracker.Result;
import com.github.ltsopensource.tasktracker.logger.BizLogger;
import com.github.ltsopensource.tasktracker.runner.JobContext;
import com.github.ltsopensource.tasktracker.runner.JobRunner;

@JobRunner4TaskTracker
public class JobRunnerImpl implements JobRunner{
	private static final Logger LOGGER = LoggerFactory.getLogger(JobRunnerImpl.class);
	
	@Override
	public Result run(JobContext jobContext) throws Throwable {
		
		try {
            BizLogger bizLogger = jobContext.getBizLogger();
            System.out.println("执行业务逻辑");
            // TODO 业务逻辑
            LOGGER.info("我要执行：" + jobContext);
            // 会发送到 LTS (JobTracker上)
            bizLogger.info("测试，业务日志啊啊啊啊啊");

        } catch (Exception e) {
            LOGGER.info("Run job failed!", e);
            return new Result(Action.EXECUTE_FAILED, e.getMessage());
        }
        return new Result(Action.EXECUTE_SUCCESS, "执行成功");
	}

}
