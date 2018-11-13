package com.hngd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hngd.model.Task;
import com.hngd.service.JobClientService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HnvmnsTaskProcessorApplicationTests {
	@Autowired
	private JobClientService jobClientService;
	@Test
	public void contextLoads() {
	}
	

}
