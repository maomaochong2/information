package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.ClassesService;
import com.example.demo.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")


public class LoginController {
    @Autowired
    private UserLoginService userLoginService;
    private ClassesService classesService;
    /**
     * 首页
     * @return
     */
    @RequestMapping(value = {"/"})
    public String index(){

        return "login";
    }

    /**
     * 登录
     * @param
     * @param
     * @param request
     * @return
     */
    @RequestMapping(value = {"/login"})
    public ModelAndView login(User user, HttpServletRequest request, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        user.setUsername(username);
        user.setPassword(password);
        user =this.userLoginService.userLogin(user);
        if (user != null) {
            session=request.getSession();
            session.setAttribute("username", username);
            mav.setViewName("index");
            return mav;
        } else {
            session.setAttribute("errormsg", "账号或密码错误!请重新输入");
        }
        mav.setViewName("login");
        return mav;
    }
}
