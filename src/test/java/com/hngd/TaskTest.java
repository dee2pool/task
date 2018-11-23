package com.hngd;


import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.gson.Gson;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import com.hngd.common.result.Result;
import com.hngd.common.web.page.PagedData;
import com.hngd.model.Task;
import com.hngd.model.TaskPo;
import com.hngd.model.TaskVo;
import com.hngd.service.JobClientService;
import com.hngd.vmns.data.HnvmnsTaskProcessorApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=HnvmnsTaskProcessorApplication.class)
public class TaskTest {
	@Autowired
	private JobClientService jobClientService;
	
	@Test
	public void addTaskTest() {
		TaskPo task=new TaskPo();
		task.setTaskName("test");
		task.setJobType(1);
		List<Map<String,String>> list=new ArrayList<>();
		Map<String,String> map=new HashMap<>();
		map.put("deviceCode","1001");
		map.put("loginName","admin");
		list.add(map);
		task.setTaskDevice(list);
		task.setTaskName("测试业务");
		Map<String,String> map2=new HashMap<>();
		map2.put("subStream","1");
		map2.put("fileType","All");
		map2.put("startTime","1542773812");
		map2.put("endTime","1542946612");
		task.setSubmitParam(map2);
		jobClientService.addJob(task);
	}

}
