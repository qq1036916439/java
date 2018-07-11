package com.zzq.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzq.mapper.TeaMapper;
import com.zzq.pojo.Tea;
import com.zzq.pojo.TeaExample;
import com.zzq.utils.PageUtil;
import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@Slf4j
public class TeacherService {
    @Autowired
    private TeaMapper teaMapper;
    public PageUtil page(Integer currentPage){
        PageUtil<Tea> teaPageUtil = new PageUtil<>();
        int i = teaMapper.selectCount();
        int ceil = (int)Math.ceil((double) i / (double) 10);
        teaPageUtil.setTotal(i);
        teaPageUtil.setEachPage(10);
        teaPageUtil.setCurrentPage(currentPage);
        teaPageUtil.setTotalPages(ceil);
        PageHelper.startPage(currentPage, 10);
        List<Tea> teas = teaMapper.selectByExample(null);
        teaPageUtil.setList(teas);
        return teaPageUtil;
    }
    public Tea getTeabyId(Integer id){
        Tea tea = teaMapper.selectByPrimaryKey(id);
        return tea;
    }
    //规定状态1为正常 状态0为离职状态新添加都为正常状态
    public int addTea(Tea tea){
        Integer teaId = tea.getTeaId();
        int i=0;
        if(teaId!=null){
            i = teaMapper.updateByPrimaryKey(tea);

        }
        else {
            tea.setStatus(1);
             i = teaMapper.insert(tea);
        }
        return i;
    }
    //查询teacher
    public List<Tea> getTeaList(){
        List<Tea> teas = teaMapper.selectByExample(new TeaExample());
        return teas;
    }
      //批量删除
            public int deleteTeabyId(Integer[] id){
                int stats=1;
                for (Integer integer : id) {
                    int i = teaMapper.deleteByPrimaryKey(integer);
                    if(i<1){
                stats=0;
            }
            log.info(i+"");
        }
       return stats;
    }

}
