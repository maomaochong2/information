package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class BookController {
    @Autowired
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
        return list;
    }
    //添加页面
    @GetMapping("/toaddbook")
    public String toadd(){
        return "toaddbook";
    }
    @PostMapping("/addbook")
    @ResponseBody
    public String add(@Valid Book book){
//        String name=book.getBookname();
//        List<Book> list=bookService.findlist();
        int add=bookService.add(book);
        return "redirect:/book";
    }
    //删除图书
    @GetMapping("/deletebook/{id}")
    @ResponseBody
    public Object delete( @PathVariable("id") Integer id){
        bookService.delete(id);
        return bookService.findlist();
    }
    @PutMapping("/toupdatebook")
    @ResponseBody
    public String toupdatebook(Model model,Integer id){
        Book book = bookService.findById(id);
        model.addAttribute("book","book");
        return "toupdatebook";
    }
}
