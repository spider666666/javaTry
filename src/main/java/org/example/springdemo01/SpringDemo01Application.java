package org.example.springdemo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.springdemo01.Mapper")
public class SpringDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemo01Application.class, args);
    }

}
