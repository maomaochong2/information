package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

    @Autowired
    private UserMapper userMapper;
    //用户登录
    public User userLogin(User user){

        user=this.userMapper.userLogin(user.getUsername(),user.getPassword());
        return user;
    }
}
