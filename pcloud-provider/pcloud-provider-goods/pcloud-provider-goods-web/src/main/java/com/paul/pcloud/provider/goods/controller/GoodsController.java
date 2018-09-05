package com.paul.pcloud.provider.goods.controller;

import com.paul.pcloud.api.user.UserServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author create by zhangbao
 * @date 2018/9/5 11:39
 * @desc
 */
@RefreshScope
@RestController
@RequestMapping(value = "/goods")
public class GoodsController {

    @Autowired
    private UserServiceApi userServiceApi;

    @RequestMapping(value = "/user/phone")
    public String getCustomerPhone(){
        return userServiceApi.getUserPhone();
    }
}
