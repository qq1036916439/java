package com.zzq.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

import javax.annotation.Resource;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
   /* @Resource(name = "userInterceptor")
    private UserInterceptor userInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userInterceptor).addPathPatterns("/**").excludePathPatterns("/login.html","/css/**","/fonts/**","/images/**","/js/**","/lib/**","/log");
    }*/



}
