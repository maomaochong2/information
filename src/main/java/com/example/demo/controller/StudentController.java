package com.example.demo.controller;

import com.example.demo.entity.ClassInfo;
import com.example.demo.entity.Stu;
import com.example.demo.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class StudentController {
    @Autowired
    private StuService stuService;

    /**
     * 班级列表
     * @param model
     * @return
     */
    @RequestMapping("/list_student")
    public String list(Model model){
        List<Stu> list=stuService.list();
        model.addAttribute("list",list);
        return "list_student";
    }
    //添加页面
    @RequestMapping("/toadd_student")
    public String add_classes(){

        return "add_student";
    }
    //添加功能
    @RequestMapping("/add_student")
    public String add(Stu stu){
        stuService.add(stu);
        return "redirect:list_student";
    }
    //删除功能
    @RequestMapping("/deleteById")
    public String delete(Integer id){
        stuService.delete(id);
        return "redirect:list_student";
    }
    //修改页面
    @RequestMapping("/toupdate_student")
    public String toupdate_student(Integer id, Model model){
       Stu stu= stuService.findById(id);
        model.addAttribute(stu);
        return "update_student";
    }
    //修改功能
    @RequestMapping("/update_student")
    public String update_student(Stu stu){
        stuService.update(stu);
        return "redirect:list_student";
    }
}
