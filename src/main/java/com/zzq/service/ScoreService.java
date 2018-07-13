package com.zzq.service;

import com.zzq.mapper.ScoreMapper;
import com.zzq.pojo.Score;
import com.zzq.utils.SelectBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;
    @CacheEvict(cacheNames = "scop",allEntries = true)
    public int addScore(Score score){
        return  scoreMapper.insert(score);
    }
    @Cacheable(cacheNames = "scop",key = "#selectBean.select+' '+#selectBean.city")
   public List  selectScore(SelectBean selectBean){
      if(selectBean.getSelect()==1) {
       return  scoreMapper.selectSourcebyStu(selectBean.getCity());
      }else {
          return scoreMapper.selectSourcebyCur(selectBean.getCity());
      }
   }
}
