package com.hospital.theforth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.hospital.theforth.mapper")
@SpringBootApplication
public class TheforthApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheforthApplication.class, args);
    }

}
