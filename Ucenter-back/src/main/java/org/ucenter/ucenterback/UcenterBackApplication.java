package org.ucenter.ucenterback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.ucenter.ucenterback.mapper")
public class UcenterBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(UcenterBackApplication.class, args);
    }

}
