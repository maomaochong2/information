package com.example.demo.controller;

import com.example.demo.entity.Message;
import com.example.demo.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MessageController {
    private MessageService messageService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Message> list(){
        List<Message> list=messageService.list();
        System.out.println(list);
        return list;
    }
    @RequestMapping("/text")
    public String text(){
        return "text";
    }

}
