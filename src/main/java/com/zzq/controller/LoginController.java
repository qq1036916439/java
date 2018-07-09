package com.zzq.controller;

import com.zzq.pojo.User;
import com.zzq.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;
    /*
          登录验证
     */
 @RequestMapping("/log")
    public String UserPast(User user, HttpServletRequest request){
     User logu = loginService.Login(user);
     if(logu!=null){
            request.getSession().setAttribute("user",logu);
            return "redirect:/";
        }
        request.setAttribute("username",user.getUsername());
        request.setAttribute("error","用户名密码错误");
        return "login";
    }

}
