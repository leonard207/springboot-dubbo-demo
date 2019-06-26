package com.wacai.qa.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wacai.qa.api.UserService;
import com.wacai.qa.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("getUser")
    public User getUser(){
        return  userService.getUser();
    }
}
