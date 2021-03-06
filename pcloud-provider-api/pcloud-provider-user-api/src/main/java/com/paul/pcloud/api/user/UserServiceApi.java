package com.paul.pcloud.api.user;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author create by zhangbao  
 * @date 2018/9/5 11:48
 * @desc  
 */  
@FeignClient(value = "user-service",fallback = com.paul.pcloud.api.user.hystrix.UserServiceHystrix.class)
public interface UserServiceApi {

    @RequestMapping(value = "/user/current/phone")
    String getUserPhone();

}
