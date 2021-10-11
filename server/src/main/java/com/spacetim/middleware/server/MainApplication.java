package com.spacetim.middleware.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author spacetim
 * @date 2021/10/9
 * @description
 */
@MapperScan(basePackages = "com.spacetim.middleware.model")
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
