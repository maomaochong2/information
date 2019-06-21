package com.example.demo.mapper;

import com.example.demo.entity.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> findlist();
    int add(Book book);
//    @Delete("delete from book where id = #{id}")
    int delete(@Param("id") Integer id);
    int update(Book book);
    Book findById(Integer id);
}
