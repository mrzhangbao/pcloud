package com.paul.pcloud.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author create by zhangbao  
 * @date 2018/9/4 10:29
 * @desc  
 */  
@EnableEurekaServer
@SpringBootApplication
public class PcloudDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcloudDiscoveryApplication.class, args);
	}
}
