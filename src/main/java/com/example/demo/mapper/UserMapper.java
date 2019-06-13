package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
//@Component
//@Repository
public interface UserMapper {
    //用户登录
    User userLogin(@Param("username") String username,@Param("password") String password);
}
