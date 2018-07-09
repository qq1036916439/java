package com.zzq.shixun;

import com.zzq.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShixunApplicationTests {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void contextLoads() {

        redisTemplate.opsForSet().add(new User(1, "asd", "adsa"), new User(1, "asd", "adsa"));
    }
	@Test
	public void test() {
        redisTemplate.opsForSet().add(new User(1, "asd", "adsa"), new User(1, "asd", "adsa"));
    }
}