package com.paul.pcloud.provider.user.controller;

import com.paul.pcloud.api.user.PayServiceApi;
import com.paul.pcloud.api.user.UserServiceApi;
import com.paul.pcloud.provider.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author create by zhangbao
 * @date 2018/9/5 10:09
 * @desc
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserServiceApi userServiceApi;

    @Autowired
    private PayServiceApi payServiceApi;

    @RequestMapping(value = "/currentUser", method = RequestMethod.GET)
    public String getCurrentUser(@RequestParam(name = "name")String name){
        return userService.getCurrentUser(name);
    }

    @RequestMapping(value = "/currentUserPhone", method = RequestMethod.GET)
    public String getCurrentUserPhone(@RequestParam(name = "name")String name){
        return userServiceApi.getUserPhone();
    }


    @RequestMapping(value = "/currentPay", method = RequestMethod.GET)
    public String getCurrentPay(@RequestParam(name = "name")String name){
        return payServiceApi.getUserPhone()+"username:"+name;
    }
}
