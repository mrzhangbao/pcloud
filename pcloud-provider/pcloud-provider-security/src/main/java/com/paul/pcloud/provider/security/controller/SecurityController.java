package com.paul.pcloud.provider.security.controller;

import com.paul.pcloud.api.user.UserServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author create by zhangbao
 * @date 2018/9/5 15:37
 * @desc
 */
@RestController
@RequestMapping(value = "/security")
public class SecurityController {

    @Autowired
    private UserServiceApi userServiceApi;

    @RequestMapping(value = "/user")
    public String getSecurityUser(@RequestParam(name = "name") String name){
        return userServiceApi.getUserPhone()+name;
    }


}
