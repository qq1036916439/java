package com.zzq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@MapperScan("com.zzq.mapper")
@SpringBootApplication
public class ShixunApplication {
	public static void main(String[] args) {
      SpringApplication.run(ShixunApplication.class, args);
	}
}
