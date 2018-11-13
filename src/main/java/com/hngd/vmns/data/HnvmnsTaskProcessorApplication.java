package com.hngd.vmns.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.github.ltsopensource.spring.boot.annotation.EnableJobClient;
import com.github.ltsopensource.spring.boot.annotation.EnableJobTracker;
import com.github.ltsopensource.spring.boot.annotation.EnableTaskTracker;

@SpringBootApplication
@EnableJobClient
@EnableJobTracker
@EnableTaskTracker
@EnableTransactionManagement
@ComponentScan("com.hngd")
public class HnvmnsTaskProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(HnvmnsTaskProcessorApplication.class, args);
	}
}
