package com.zzq.mapper;

import com.zzq.pojo.Curriculum;
import com.zzq.pojo.CurriculumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurriculumMapper {
    int countByExample(CurriculumExample example);
      int selectCount();
    int deleteByExample(CurriculumExample example);

    int deleteByPrimaryKey(Integer curriculumId);

    int insert(Curriculum record);

    int insertSelective(Curriculum record);

    List<Curriculum> selectByExample(CurriculumExample example);

    Curriculum selectByPrimaryKey(Integer curriculumId);

    int updateByExampleSelective(@Param("record") Curriculum record, @Param("example") CurriculumExample example);

    int updateByExample(@Param("record") Curriculum record, @Param("example") CurriculumExample example);

    int updateByPrimaryKeySelective(Curriculum record);

    int updateByPrimaryKey(Curriculum record);
}