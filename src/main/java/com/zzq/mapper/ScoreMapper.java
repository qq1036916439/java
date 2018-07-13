package com.zzq.mapper;

import com.zzq.pojo.Score;
import com.zzq.pojo.ScoreExample;
import java.util.List;

import com.zzq.pojo.SourceBean;
import org.apache.ibatis.annotations.Param;

public interface ScoreMapper {
    int countByExample(ScoreExample example);

    int deleteByExample(ScoreExample example);

    int insert(Score record);

    int insertSelective(Score record);
     List<SourceBean> selectSourcebyCur(Integer integer);
    List<Score> selectByExample(ScoreExample example);

    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreExample example);

    int updateByExample(@Param("record") Score record, @Param("example") ScoreExample example);

    List<SourceBean>  selectSourcebyStu(Integer integer);
}