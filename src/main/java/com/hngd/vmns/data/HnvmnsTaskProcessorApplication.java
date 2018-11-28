package com.hngd.vmns.data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.github.ltsopensource.spring.boot.annotation.EnableJobClient;
import com.github.ltsopensource.spring.boot.annotation.EnableJobTracker;
import com.github.ltsopensource.spring.boot.annotation.EnableTaskTracker;

@EnableJobClient
@EnableJobTracker
@EnableTaskTracker
@EnableEurekaClient
@EnableTransactionManagement
@ServletComponentScan
@SpringBootApplication(scanBasePackages={"com.hngd"})
@MapperScan(value={"com.hngd.dao"})
public class HnvmnsTaskProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(HnvmnsTaskProcessorApplication.class, args);
	}
}
