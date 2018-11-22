package com.hngd;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.gson.Gson;
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
	Result<PagedData<TaskVo>> r=jobClientService.getTaskList(1,20,null,null, null, null, null, null, null);
	System.out.println(r);
	}

}
