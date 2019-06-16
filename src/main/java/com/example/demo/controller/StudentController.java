package com.example.demo.controller;

import com.example.demo.entity.ClassInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class StudentController {

    /**
     * 班级列表
     * @param model
     * @return
     */
    @RequestMapping("/list_student")
    public String list(Model model){
//        List<ClassInfo> list=classesService.list();
//        model.addAttribute("list",list);
        return "list_student";
    }
    //添加页面
    @RequestMapping("/add_student")
    public String add_classes(){

        return "add_student";
    }
}
