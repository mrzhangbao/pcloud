package com.paul.pcloud.provider.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author create by zhangbao  
 * @date 2018/9/5 11:39  
 * @desc  
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.paul.pcloud.api"})
public class PcloudProviderGoodsWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcloudProviderGoodsWebApplication.class, args);
	}
}
