package com.sizheng.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.sizheng.gmall.manage.mapper")
public class GmallRedissonTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallRedissonTestApplication.class, args);
    }

}
