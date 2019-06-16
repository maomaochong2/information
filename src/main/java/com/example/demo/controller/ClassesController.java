package com.example.demo.controller;

import com.example.demo.entity.ClassInfo;
import com.example.demo.service.ClassesService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class ClassesController {

    @Autowired
    private ClassesService classesService;


    /**
     * 班级列表
     * @param model
     * @return
     */
    @RequestMapping("/list_classes")
    public String list(Model model){
        List<ClassInfo> list=classesService.list();
        model.addAttribute("list",list);
        return "list_classes";
    }

    /**
     * 添加功能
     * @param classInfo
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public String add(ClassInfo classInfo){
        classesService.add(classInfo);
        return "redirect:list_classes";
    }
    /**
     * 添加页面
     * @param
     * @return
     */
    @RequestMapping("/add_classes")
    public String add_classes(){

        return "add_classes";
    }
    @RequestMapping("/update_classes")
    public String update_classes(Model model,Integer id){
        ClassInfo classInfo=classesService.findById(id);
        model.addAttribute("classInfo",classInfo);
        return "update_classes";
    }
    @PostMapping("/update")
    public String update(ClassInfo classInfo){
        classesService.update(classInfo);
        return "redirect:list_classes";
    }
    @RequestMapping("/delete")
    public String delete(Integer id){
        classesService.delete(id);
        return "redirect:list_classes";
    }
    @GetMapping("/findByCname/{cname}")
    @ResponseBody
    public Object findByCname(@PathVariable String cname){

        return classesService.findByCname(String.valueOf(cname));//.findByCname(String.valueOf(cname)); //.findById(Integer.valueOf(id));
    }
}
