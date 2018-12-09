package com.example.fkbookapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.sql.DataSource;

@EnableScheduling
@SpringBootApplication
@MapperScan(value = "com.example.fkbookapp.mapper")
public class Application {

    @Autowired
    DataSource dataSource;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * 查看用了什么数据库连接池
     */
    public void run(String... args) throws Exception {
        System.out.println("DATASOURCE = " + dataSource);
    }
}
