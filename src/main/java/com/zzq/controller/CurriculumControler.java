package com.zzq.controller;

import com.zzq.pojo.Curriculum;
import com.zzq.pojo.Student;
import com.zzq.service.CurriculumService;
import com.zzq.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.List;   

@Controller
public class CurriculumControler {


    @Autowired
    private CurriculumService curriculumService;



    @GetMapping("/curriculum/sel/{id}")
    public String getTeacherbyId(@PathVariable("id") Integer id, Model model){
        Curriculum curriculum= curriculumService.getCurriculumbyId(id);
        model.addAttribute("status","1");
        model.addAttribute("curriculum",curriculum);
        return "order-add";
    }
    @ResponseBody
    @PostMapping("/curriculum/add")
    public String addStudent(Curriculum curriculum,@RequestParam(defaultValue = "0") Integer status){

        if(status==1) {
            return curriculumService.editCur(curriculum) + "";
        }
        {
  return curriculumService.addCur(curriculum) + "";
        }

    }
    @GetMapping ("/curriculum/addView")
    public String addStudentView(Student stu, Model model){
        //model.addAttribute("stu",stu);
        return "order-add";
    }

    @GetMapping(value = "/curriculum/list")
    public String getTeaList(@RequestParam(defaultValue = "1")Integer currentPage, Model model){
        PageUtil page = curriculumService.page(currentPage);
        model.addAttribute("page",page);
        return "order-list";
    }
      @ResponseBody
    @GetMapping("/curriculumid/list")
    public List<Curriculum> getCurList(){
          List<Curriculum> curricula = curriculumService.selectAllCur();

          return curricula;
    }

    @ResponseBody
    @PostMapping("/curriculum/del")
    public String deleteTeabyId(@RequestParam("ids[]")Integer[] ids){
        if(ids==null){
            return 0+" ";
        }
        int i = curriculumService.deleteCurriculumId(ids);
        return "i";
    }

}
