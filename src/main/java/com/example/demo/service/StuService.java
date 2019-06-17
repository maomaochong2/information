package com.example.demo.service;

import com.example.demo.entity.Stu;
import com.example.demo.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuService {
    @Autowired
    private StuMapper stuMapper;
    public List<Stu> list(){
        return stuMapper.list();
    }
}
