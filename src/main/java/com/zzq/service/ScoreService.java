package com.zzq.service;

import com.zzq.mapper.ScoreMapper;
import com.zzq.pojo.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;

    public int addScore(Score score){
        return  scoreMapper.insert(score);
    }
}
