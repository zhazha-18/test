package com.rongyi.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//表明这是注册中心  标注为注册中心服务
public class BaiseeRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaiseeRegisterApplication.class, args);
		System.out.println("测试dev分支");
		
	}

}
