package com.zzq.controller;

import com.zzq.pojo.Student;
import com.zzq.service.StudentService;
import com.zzq.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
        @Autowired
        private StudentService studentService;
    @GetMapping("/student/sel/{id}")
    public String getTeacherbyId(@PathVariable("id") Integer id, Model model){
        Student student = studentService.getStuabyId(id);
        model.addAttribute("stu",student);
        return "admin-add";
    }
    @ResponseBody
    @PostMapping("/student/add")
    public String addStudent(Student student){
        int i = studentService.addStu(student);
        if(i>=1)
            return "200";

        return "100";
    }
    @GetMapping ("/student/addView")
    public String addStudentView(Student stu,Model model){
        //model.addAttribute("stu",stu);
        return "admin-add";
    }

    @GetMapping("/student/list")
    public String getTeaList(@RequestParam(defaultValue = "1")Integer currentPage, Model model){
        PageUtil page = studentService.page(currentPage);
        model.addAttribute("page",page);
        return "admin-list";
    }
    @ResponseBody
    @PostMapping("/student/del")
    public String deleteTeabyId(@RequestParam("ids[]")Integer[] ids){
        if(ids==null){
            return 0+" ";
        }
        int i = studentService.deleteTeabyId(ids);
        return "i";
    }
}
