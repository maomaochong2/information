package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {
    private BookService bookService;

    //
    @RequestMapping("/book")
    public String book(){
        return "book";
    }

    //查找图书列表
    @GetMapping("/findlist")
    @ResponseBody
    public List<Book> findlist(){
        List<Book> list=bookService.findlist();
        System.out.println(list);
        return list;
    }
}
