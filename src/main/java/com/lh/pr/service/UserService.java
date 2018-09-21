package com.lh.pr.service;

import org.springframework.stereotype.Service;

import com.lh.pr.pojo.User;
import com.lh.pr.utils.Result;

/**
 * 模拟service层
 * @author 刘昊
 *
 */
@Service
public class UserService {
    
    public Result searchUser(User user) {
        if(user.getAge()!=null && user.getName()!=null) {
            Result result = Result.success();
            return result;
        }
        else { 
            Result result = Result.build(404, "fail", new Object());
            return result;
        }
    }
}
