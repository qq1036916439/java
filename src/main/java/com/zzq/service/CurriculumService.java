package com.zzq.service;

import com.github.pagehelper.PageHelper;
import com.zzq.mapper.CurriculumMapper;
import com.zzq.pojo.Curriculum;
import com.zzq.utils.PageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class CurriculumService {

    @Autowired
    private CurriculumMapper curriculumMapper;

    public List<Curriculum> selectAllCur(){
        return curriculumMapper.selectByExample(null);

    }

    public  int editCur(Curriculum curriculum){
       return curriculumMapper.updateByPrimaryKey(curriculum);

    }

    public PageUtil page(Integer currentPage) {
        PageUtil<Curriculum> teaPageUtil = new PageUtil<>();
        int i = curriculumMapper.selectCount();

        double dceil = Math.ceil((double) i / (double)5);
        int j=(int) dceil;
        teaPageUtil.setTotal(i);
        teaPageUtil.setEachPage(5);
        teaPageUtil.setCurrentPage(currentPage);
        teaPageUtil.setTotalPages(j);
        PageHelper.startPage(currentPage, 5);
        List<Curriculum> curricula = curriculumMapper.selectByExample(null);
        teaPageUtil.setList(curricula);
        return teaPageUtil;
    }

    //批量删除
    public int deleteCurriculumId(Integer[] id) {
        int stats = 1;
        for (Integer integer : id) {
            int i = curriculumMapper.deleteByPrimaryKey(integer);
            if (i < 1) {
                stats = 0;
            }
            log.info(i + "");
        }
        return stats;
    }

    public int addCur(Curriculum curriculum) {




        return curriculumMapper.insert(curriculum);
    }


    public Curriculum getCurriculumbyId(Integer id) {
        return curriculumMapper.selectByPrimaryKey(id);
    }
}
