package com.wacai.qa.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wacai.qa.api.UserService;
import com.wacai.qa.bean.User;
import org.springframework.stereotype.Component;

@Component
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser() {
        return new User(1L,"Tom");
    }
}
