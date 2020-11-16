package com.sizheng.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.sizheng.gmall.oder.mapper")
public class GmallOderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallOderServiceApplication.class, args);
    }

}
