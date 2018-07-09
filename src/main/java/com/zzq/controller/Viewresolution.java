package com.zzq.controller;

import org.springframework.stereotype.Controller;
/**
 * 进行视图解析
 */
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Viewresolution {
    @RequestMapping("/welcome.html")
    public String Welcome(){
        return "welcome";
    }

   /* @RequestMapping("/member-list.html")
    public String Memberlist(){
        return "member-list";
    }*/
    @RequestMapping("/member-del.html")
    public String MemberDel(){
        return "member-del";
    }
    @RequestMapping("/order-list.html")
    public String OrderList(){
        return "order-list";
    }
    @RequestMapping("/admin-list.html")
    public String Adminlist(){
        return "admin-list";
    }
    @RequestMapping("/admin-cate.html")
    public String AdminCate(){
        return "admin-cate";
    }
  @RequestMapping("/admin-role.html")
    public String AdminRole(){
        return "admin-role";
    }
    @RequestMapping("/admin-rule.html")
    public String AdminRule(){
        return "admin-rule";
    }

    @RequestMapping("/login.html")
    public String Login(){
        return "login";
    }
    @RequestMapping("/")
    public String demo(){
        return "index";
    }
}
