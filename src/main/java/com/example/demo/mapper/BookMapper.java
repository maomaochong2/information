package com.example.demo.mapper;

import com.example.demo.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> findlist();
    int add(Book book);
    int delete(Integer id);
    int update(Book book);
    Book findById(Integer id);
}
