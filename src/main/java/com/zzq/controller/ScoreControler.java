package com.zzq.controller;

import com.zzq.mapper.ScoreMapper;
import com.zzq.pojo.Score;
import com.zzq.service.ScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class ScoreControler
{
@Autowired
private ScoreService scoreService;
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
