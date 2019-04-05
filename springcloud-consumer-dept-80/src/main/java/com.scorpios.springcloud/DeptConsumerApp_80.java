package com.scorpios.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptConsumerApp_80 {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumerApp_80.class, args);
	}
}
