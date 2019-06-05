package com.kalearn.javaserver.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.kalearn.javaserver.dao")
public class MybatisConfig {

}
