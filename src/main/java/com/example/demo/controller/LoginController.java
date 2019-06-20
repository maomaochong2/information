package com.example.demo.controller;

import com.example.demo.entity.ClassInfo;
import com.example.demo.entity.User;
import com.example.demo.service.ClassesService;
import com.example.demo.service.UserLoginService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Api(value = "/")
@Controller
@RequestMapping("/")
public class LoginController {
    @Autowired
    private UserLoginService userLoginService;
    /**
     * 首页
     * @return
     */
    @RequestMapping(value = {"/"})
    public String index(){

        return "login";
    }
    @RequestMapping("/index")
    public String index1(){
        return "index";
    }
    //修改密码页面
    @RequestMapping(value = {"/updatepassword"})
    public String updatepassword(Model model, Integer id){
//        User user=userLoginService.findById(id);
//        model.addAttribute("user",user);
        return "password";
    }
    //修改密码功能
    @PostMapping("/updatepwd")
    public String update(User user,HttpServletRequest request,Model model){
        String password = request.getParameter("password");
        if(password != null){
            model.addAttribute("msg","密码错误!请重新输入");
            userLoginService.updatepwd(user);
            return "redirect:login";
        }else{
            return "password";
        }
    }
    //修改个人资料页面
    @RequestMapping(value = {"/updateprofile"})
    public String updateprofile(){

        return "profile";
    }

    /**
     * 登录
     * @param
     * @param
     * @param request
     * @return
     */
    @RequestMapping(value = {"/login"})
    public ModelAndView login(User user, HttpServletRequest request, HttpSession session,Model model) {
        ModelAndView mav = new ModelAndView();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        user.setUsername(username);
        user.setPassword(password);
        user =this.userLoginService.userLogin(user);
        if (user != null) {
            session=request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("password",password);
            mav.setViewName("index");
            return mav;
        } else {
            model.addAttribute("errormsg","账号或密码错误！");
            mav.setViewName("login");
        }
        return mav;
    }
    @RequestMapping(value = {"/loginout"})
    public String loginout(Model model, HttpServletRequest request){
        if(request.getSession().getAttribute("user")!=null){
            request.getSession().removeAttribute("user");
        }
        return "login";
    }

}
