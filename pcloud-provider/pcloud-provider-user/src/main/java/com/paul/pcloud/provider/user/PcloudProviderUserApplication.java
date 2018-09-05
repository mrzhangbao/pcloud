package com.paul.pcloud.provider.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

/**
 * 使用@EnableFeignClients(basePackages = {"***"})扫描接口类所在的包，spring的容器中才会有代理实现类.避免在不同包下无法扫描接口问题
 */
/**
 * @author create by zhangbao
 * @date 2018/9/4 19:05
 * @desc
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.paul.pcloud.api.*"})
@EnableEurekaClient
@EnableHystrix
@ComponentScan(basePackages = {"com.paul.pcloud","com.paul.pcloud.api.*"})
public class PcloudProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcloudProviderUserApplication.class, args);
	}
}
