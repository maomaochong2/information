package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;
    public List<Book> findlist(){
        return bookMapper.findlist();
    }
    public int add(Book book){
        return bookMapper.add(book);
    }
    public int delete(Integer id){
        return bookMapper.delete(id);
    }
    public int update(Book book){

        return bookMapper.update(book);
    }
    public Book findById(Integer id){
        return bookMapper.findById(id);
    }

}
