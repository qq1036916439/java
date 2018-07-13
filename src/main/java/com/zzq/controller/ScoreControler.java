package com.zzq.controller;

import com.zzq.mapper.ScoreMapper;
import com.zzq.pojo.Score;
import com.zzq.service.ScoreService;
import com.zzq.utils.SelectBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
public class ScoreControler
{
@Autowired
private ScoreService scoreService;
    @RequestMapping("/Score/select")
    public String selectScore(SelectBean selectBean,Model model){
        List list = scoreService.selectScore(selectBean);
        model.addAttribute("list",list);
        return "admin-role";
    }
    @RequestMapping("/Score/editView/{id}")
    public String deitScore(@PathVariable Integer id, Model model){
        log.info(id+"");
        model.addAttribute("stuid",id);
        return "admin-edit";
    }


@ResponseBody
    @PostMapping ("/Score/addScore")
    public String addScore(Score score){
    int i = scoreService.addScore(score);
    if(i==1)
   return "200";
    else
        return "500";
    }


}
