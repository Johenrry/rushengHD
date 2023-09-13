package com.example.rusheng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.rusheng.mapper")
public class ProfessionalClassiHelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProfessionalClassiHelperApplication.class, args);
    }

}
