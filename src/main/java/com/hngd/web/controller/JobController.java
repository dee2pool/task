package com.hngd.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hngd.common.result.Result;
import com.hngd.common.web.RestResponses;
import com.hngd.common.web.result.RestResponse;
import com.hngd.model.Job;
import com.hngd.service.JobClientService;

@RestController
@RequestMapping("/task")
public class JobController {
	private static final Logger logger = LoggerFactory.getLogger(JobController.class);
	
	@Autowired
	private JobClientService jobClientService;
	
	/*添加任务*/
	public RestResponse<String> addJob(@RequestBody @RequestParam("job")Job job){
		Result<String> result=jobClientService.addJob(job);
		if(result.isSuccess()) {
			return RestResponses.newSuccessResponse("添加任务成功", 1, result.getData());
		}else {
			return RestResponses.newFailResponse(result.getErrorCode(), result.getDescription());
		}
	}
}
