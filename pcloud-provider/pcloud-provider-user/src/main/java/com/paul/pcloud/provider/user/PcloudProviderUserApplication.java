package com.paul.pcloud.provider.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author create by zhangbao  
 * @date 2018/9/4 19:05
 * @desc  
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.paul.pcloud.api"})
@EnableEurekaClient
public class PcloudProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcloudProviderUserApplication.class, args);
	}
}
