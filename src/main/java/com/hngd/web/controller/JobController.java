package com.hngd.web.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hngd.common.error.ErrorCode;
import com.hngd.common.result.Result;
import com.hngd.common.web.RestResponses;
import com.hngd.common.web.page.PagedData;
import com.hngd.common.web.parameter.GsonEditor;
import com.hngd.common.web.result.RestResponse;
import com.hngd.model.Task;
import com.hngd.model.TaskPo;
import com.hngd.model.TaskVo;
import com.hngd.service.JobClientService;

@RestController
@RequestMapping("/task")
public class JobController {
	private static final Logger logger = LoggerFactory.getLogger(JobController.class);
	
	@Autowired
	private JobClientService jobClientService;
	
	@InitBinder
	public void onBinderInit(WebDataBinder binder) {
		binder.registerCustomEditor(TaskPo.class, new GsonEditor(TaskPo.class));
	}
	
	/*添加任务*/
	@ResponseBody
	@PostMapping("/add")
	public RestResponse<String> addJob(@RequestBody @RequestParam("task")TaskPo task){
		Result<String> result=jobClientService.addJob(task);
		if(result.isSuccess()) {
			return RestResponses.newSuccessResponse("添加任务成功", 1, result.getData());
		}else {
			return RestResponses.newFailResponse(result.getErrorCode(), result.getDescription());
		}
	}
	
	/*查询提交后任务列表*/
	@ResponseBody
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public RestResponse<List<TaskVo>> getTaskList(@RequestParam( "pageNo") Integer pageNo,
			@RequestParam( "pageSize") Integer pageSize,
			@RequestParam(value="taskName",required=false) String taskName,
			@RequestParam(value="taskType",required=false) String taskType,
			@RequestParam(value="jobType",required=false) Integer jobType,
			@RequestParam(value="submitResult",required=false) String submitResult,
			@RequestParam(value="executeResult",required=false) String executeResult,
			@RequestParam(value="beginTime",required=false) Date beginTime,
			@RequestParam(value="endTime",required=false) Date endTime){
		Result<PagedData<TaskVo>> p=jobClientService.getTaskList(pageNo,pageSize,taskName,taskType,jobType,submitResult,executeResult,beginTime,endTime);
		if (p.isSuccess()) {
		    List<TaskVo> list = p.getData().getResult();
			Long total = p.getData().getTotal();
		    return RestResponses.newSuccessResponse("查询任务信息成功", list.size(), list, total); 
		} else {
			return RestResponses.newFailResponse(ErrorCode.INVALID_PARAMETER,"查询任务信息失败");
		}
	}
}
