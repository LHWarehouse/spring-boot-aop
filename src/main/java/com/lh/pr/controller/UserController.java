package com.lh.pr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lh.pr.anno.Action;
import com.lh.pr.pojo.User;
import com.lh.pr.service.UserService;
import com.lh.pr.utils.Result;

/**
 * controller层
 * @author 刘昊
 *
 */
@Controller
public class UserController {
    
    @Autowired
    private UserService user_service;
    
    /**
     * 拦截url 获取传递参数 /user?name=&age=
     * @param user
     * @return
     * @Action("hello") 自定义拦截方法，传入方法名
     */
    @ResponseBody
    @RequestMapping("/user")
    @Action("hello")
    public Result showUser(User user) {
        Result result = user_service.searchUser(user);
        return result;
    }
}
