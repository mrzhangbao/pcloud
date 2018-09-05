package com.paul.pcloud.provider.pay.controller;


import com.paul.pcloud.api.user.UserServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author create by zhangbao
 * @date 2018/9/5 15:22
 * @desc
 */
@RestController
@RequestMapping(value = "/pay")
public class PayController {

    @Autowired
    private UserServiceApi userServiceApi;

    @RequestMapping(value = "/user")
    public String getCurrentPay(){
        return userServiceApi.getUserPhone();
    }
}
