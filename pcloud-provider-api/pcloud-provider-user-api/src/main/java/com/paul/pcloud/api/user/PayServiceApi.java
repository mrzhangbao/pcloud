package com.paul.pcloud.api.user;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author create by zhangbao
 * @date 2018/9/5 16:47
 * @desc
 */
@FeignClient(value = "pay-service")
public interface PayServiceApi {

    @RequestMapping(value = "/pay/user")
    String getUserPhone();
}
