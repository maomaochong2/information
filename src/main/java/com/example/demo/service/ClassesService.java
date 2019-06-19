package com.example.demo.service;

import com.example.demo.entity.ClassInfo;
import com.example.demo.mapper.ClassesMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesService {
    @Autowired
    private ClassesMapper classesMapper;
    public int add( ClassInfo classInfo){

        return classesMapper.add(classInfo);
    }
    public int delete(Integer id){

        return classesMapper.delete(id);
    }
    public int update(ClassInfo classInfo){

        return classesMapper.update(classInfo);
    }
    public List<ClassInfo> list(){

        return classesMapper.list();
    }
        public ClassInfo findById(Integer id){

        return classesMapper.findById(id);
    }
    public List<ClassInfo> findByCname(String cname) {
        return classesMapper.findByCname(cname);
    }
}

