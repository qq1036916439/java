package com.zzq.service;

import com.github.pagehelper.PageHelper;
import com.zzq.mapper.UserMapper;
import com.zzq.pojo.User;
import com.zzq.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoginService {

    @Autowired
    private UserMapper userMapper;
//@Cacheable(cacheNames = "user",key = "#user.username")
    public User Login(User user){
      PageHelper.startPage(1,2);
       System.out.println("查询数据");
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria().andPasswordEqualTo(user.getPassword()).andUsernameEqualTo(user.getUsername());
        List<User> users = userMapper.selectByExample(userExample);
        if(users!=null&&users.size()>0){
            return users.get(0);
        }       else {
            return null;
        }


    }

}
