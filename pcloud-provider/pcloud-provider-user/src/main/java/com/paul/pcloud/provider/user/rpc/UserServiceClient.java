package com.paul.pcloud.provider.user.rpc;

import com.paul.pcloud.api.user.UserServiceApi;
import com.paul.pcloud.provider.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author create by zhangbao  
 * @date 2018/9/5 10:55
 * @desc  
 */
@RefreshScope
@RestController
public class UserServiceClient implements UserServiceApi {

    @Autowired
    private UserService userService;
    
    
    @Override
    public String getUserPhone() {
        return userService.getCurrentUser("zhang") + ",Phone:15766665555" ;
    }

}
