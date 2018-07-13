package com.zzq.shixun;


import com.github.pagehelper.PageHelper;
import com.zzq.mapper.CurriculumMapper;
import com.zzq.mapper.ScoreMapper;
import com.zzq.mapper.StudentMapper;
import com.zzq.mapper.TeaMapper;
import com.zzq.pojo.Curriculum;
import com.zzq.pojo.SourceBean;
import com.zzq.pojo.TeaExample;
import com.zzq.utils.PageUtil;
import com.zzq.pojo.Tea;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShixunApplicationTests {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private TeaMapper teaMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private CurriculumMapper curriculumMapper;
    @Autowired
    private ScoreMapper scoreMapper;
    @Test
    public void contextLoads() {
       // List<SourceBean> sourceBeans = scoreMapper.selectSource(null);
      //  System.out.println(sourceBeans.size());
    }

      //  redisTemplate.opsForSet().add(new User(1, "asd", "adsa"), new User(1, "asd", "adsa"));

	@Test
	public void test() {


        int i = teaMapper.selectCount();
        TeaExample teaExample = new TeaExample();
        TeaExample.Criteria criteria = teaExample.createCriteria();
        criteria.andTeaNameLike("%张%");
        teaMapper.selectByExample(teaExample);
        PageUtil<Tea> teaPageUtil = new PageUtil<>();
        PageHelper.startPage(1,3);
        List<Tea> teas = teaMapper.selectByExample(null);
        teaPageUtil.setTotal(i);
        teaPageUtil.setList(teas);
    }
    @Test
    public void test1(){
        double l=2.5;
        double j = (double)376/(double)10;
       int ceil =(int) Math.ceil(l);
        log.info(ceil+""+j);
    }
}