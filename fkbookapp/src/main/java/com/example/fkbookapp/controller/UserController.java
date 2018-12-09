package com.example.fkbookapp.controller;


import com.example.fkbookapp.model.User;
import com.example.fkbookapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value ="/login",method = RequestMethod.GET)
    public String login(String loginname, String password, ModelAndView mv, HttpSession session){

        User user =userService.login(loginname,password);
        if (user !=null){
            System.out.println("登录成功");
            session.setAttribute("user",user);


        }else{
            System.out.println("message,登录名或密码错误，请重新输入");
        }
        return  "success";

    }


}
