package com.paul.pcloud.provider.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author create by zhangbao
 * @date 2018/9/5 15:42
 * @desc
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients
public class PcloudProviderSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcloudProviderSecurityApplication.class, args);
	}
}
