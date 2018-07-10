package com.zzq.shixun;


import com.github.pagehelper.PageHelper;
import com.zzq.mapper.TeaMapper;
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
    @Test
    public void contextLoads() {
        for (int i = 0; i <100 ; i++) {
            Tea tea = new Tea();
            tea.setPassword("666");
            teaMapper.insert(tea);
        }

      //  redisTemplate.opsForSet().add(new User(1, "asd", "adsa"), new User(1, "asd", "adsa"));
    }
	@Test
	public void test() {


        int i = teaMapper.selectCount();
        PageUtil<Tea> teaPageUtil = new PageUtil<>();
        PageHelper.startPage(1,3);
        List<Tea> teas = teaMapper.selectByExample(null);
        teaPageUtil.setTotal(i);
        teaPageUtil.setList(teas);
    }
}