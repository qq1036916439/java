package com.zzq.controller;

import com.zzq.mapper.TeaMapper;
import com.zzq.pojo.Tea;
import com.zzq.service.TeacherService;
import com.zzq.utils.PageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.util.Enumeration;
import java.util.List;
@Slf4j
@Controller
public class  TeacherController {
    @Autowired
    private TeacherService teacherService;


    @GetMapping("/teacher/list")
    public String getTeaList(@RequestParam(defaultValue = "1")Integer currentPage,Model model){
        PageUtil page = teacherService.page(currentPage);
        model.addAttribute("page",page);
        return "member-list";
    }

   /* @GetMapping("/teacher/list")
    public String gerTeaList(Model model){
        List<Tea> teaList = teacherService.getTeaList();
        model.addAttribute("teacherlist",teaList);
        return "member-list";
    }*/
    @ResponseBody
     @PostMapping("/teacher/del")
    public String deleteTeabyId(@RequestParam("ids[]")Integer[] ids){
          if(ids==null){
            return 0+" ";
        }
         int i = teacherService.deleteTeabyId(ids);
        return "i";
    }
    @GetMapping ("/teacher/addView")
    public String addTeaView(Tea tea){
       return "member-add";
    }
    @ResponseBody
    @PostMapping("/teacher/add")
    public String addTea(Tea tea){
        int i = teacherService.addTea(tea);
        if(i>=1)
            return "200";

        return "100";
    }
    @GetMapping("/teacher/sel/{id}")
    public String getTeacherbyId(@PathVariable("id") Integer id,Model model){
        Tea teabyId = teacherService.getTeabyId(id);
        model.addAttribute("tea",teabyId);
        return "member-add";
    }

}
