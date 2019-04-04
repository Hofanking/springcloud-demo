package com.scorpios.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient // 本服务启动后会自动注册进eureka服务中
//@EnableDiscoveryClient // 服务发现
public class DeptProviderApp_8001 {
	public static void main(String[] args) {
		SpringApplication.run(DeptProviderApp_8001.class, args);
	}
}