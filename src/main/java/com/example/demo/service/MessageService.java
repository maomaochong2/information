package com.example.demo.service;

import com.example.demo.entity.Message;
import com.example.demo.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MessageService {
    @Autowired
    private MessageMapper messageMapper;
    public List<Message> list(){
        return messageMapper.list();
    }

}
