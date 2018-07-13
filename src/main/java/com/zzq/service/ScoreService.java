package com.zzq.service;

import com.zzq.mapper.ScoreMapper;
import com.zzq.pojo.Score;
import com.zzq.utils.SelectBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;

    public int addScore(Score score){
        return  scoreMapper.insert(score);
    }
   public List  selectScore(SelectBean selectBean){
      if(selectBean.getSelect()==1) {
       return  scoreMapper.selectSourcebyStu(selectBean.getCity());
      }else {
          return scoreMapper.selectSourcebyCur(selectBean.getCity());
      }
   }
}
