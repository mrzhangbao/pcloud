package com.paul.pcloud.api.user.hystrix;

import com.paul.pcloud.api.user.UserServiceApi;
import org.springframework.stereotype.Component;

/**
 * @author create by zhangbao  
 * @date 2018/9/5 17:58
 * @desc  
 */  
@Component
public class UserServiceHystrix implements UserServiceApi{

    @Override
    public String getUserPhone() {
        return "sorry userService error!!!";
    }
}
