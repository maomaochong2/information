package com.example.demo.mapper;

import com.example.demo.entity.ClassInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface ClassesMapper {
    int add(ClassInfo classInfo);
    int delete(Integer id);
    int update(ClassInfo classInfo);
    List<ClassInfo> list();
    ClassInfo findById(Integer id);
    ClassInfo findByCname(@Param("cname") String cname);
}
