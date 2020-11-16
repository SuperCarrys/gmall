package com.sizheng.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GmallOderWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallOderWebApplication.class, args);
    }

}
