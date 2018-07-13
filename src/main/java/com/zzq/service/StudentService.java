package com.zzq.service;

import com.github.pagehelper.PageHelper;
import com.zzq.mapper.StudentMapper;
import com.zzq.pojo.Student;
import com.zzq.utils.PageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public PageUtil page(Integer currentPage) {
        PageUtil<Student> teaPageUtil = new PageUtil<>();
        int i = studentMapper.selectCount();

        double dceil = Math.ceil((double) i / (double)5);
        int j=(int) dceil;
        teaPageUtil.setTotal(i);
        teaPageUtil.setEachPage(5);
        teaPageUtil.setCurrentPage(currentPage);
        teaPageUtil.setTotalPages(j);
        PageHelper.startPage(currentPage, 5);
        List<Student> students = studentMapper.selectByExample(null);
        teaPageUtil.setList(students);
        return teaPageUtil;
    }

    //批量删除
    public int deleteTeabyId(Integer[] id) {
        int stats = 1;
        for (Integer integer : id) {
            int i = studentMapper.deleteByPrimaryKey(integer);
            if (i < 1) {
                stats = 0;
            }
            log.info(i + "");
        }
        return stats;
    }

    public int addStu(Student student) {
        Integer teaId = student.getStuId();
        int i=0;
        if(teaId!=null){
            i = studentMapper.updateByPrimaryKey(student);

        }
        else {
            student.setStatus(1);
            i = studentMapper.insert(student);
        }
        return i;
    }


    public Student getStuabyId(Integer id) {
       return studentMapper.selectByPrimaryKey(id);
    }

    public List<Student> getSelectStu() {
        List<Student> students = studentMapper.selectByExample(null);
        return students;
    }
}