package com.hngd.service;

import com.hngd.common.result.Result;
import com.hngd.common.web.page.PagedData;
import com.hngd.model.Job;

public interface JobClientService {
	//添加任务
	Result<String> addJob(Job job);
}
