package com.hngd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hngd.model.Task;
import com.hngd.service.JobClientService;
import com.hngd.vmns.data.HnvmnsTaskProcessorApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=HnvmnsTaskProcessorApplication.class)
public class TaskTest {
	@Autowired
	private JobClientService jobClientService;
	
	@Test
	public void addTaskTest() {
		Task task=new Task();
		task.setJobType(1);
		task.setTaskType("录像文件查询");
		jobClientService.addJob(task);
	}

}
