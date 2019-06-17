package com.example.demo.mapper;

import com.example.demo.entity.Stu;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StuMapper {

    List<Stu> list();
    int delete(Integer id);
    int add(Stu stu);
    int update(Stu stu);
    Stu findById(Integer id);
}
