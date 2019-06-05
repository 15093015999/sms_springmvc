package com.kalearn.javaserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kalearn.javaserver.dao")
public class JavaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaserverApplication.class, args);
    }

}
