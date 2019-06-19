package com.example.demo.service;

import com.example.demo.entity.ClassInfo;
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
    public int add(Stu stu){
        return stuMapper.add(stu);
    }
    public int delete(Integer id){
        return stuMapper.delete(id);
    }
    public int update(Stu stu){
        return stuMapper.update(stu);
    }
    public Stu findById(Integer id){
        return stuMapper.findById(id);
    }
    public List<Stu> findByStuId(Integer stuid){
        return stuMapper.findByStuId(stuid);
    }
//    public List<ClassInfo> findByCname(String cname) {
//        return classesMapper.findByCname(cname);
//    }
}
