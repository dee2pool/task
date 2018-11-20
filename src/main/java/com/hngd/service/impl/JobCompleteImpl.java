package com.hngd.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.github.ltsopensource.core.commons.utils.CollectionUtils;
import com.github.ltsopensource.core.domain.JobResult;
import com.github.ltsopensource.jobclient.support.JobCompletedHandler;
import com.github.ltsopensource.spring.boot.annotation.JobCompletedHandler4JobClient;

@JobCompletedHandler4JobClient
public class JobCompleteImpl implements JobCompletedHandler{

	@Override
	public void onComplete(List<JobResult> jobResults) {
		// 任务执行反馈结果处理
        if (CollectionUtils.isNotEmpty(jobResults)) {
            for (JobResult jobResult : jobResults) {
            	
            }
        }
		
	}

}
