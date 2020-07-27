package com.jay.imall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by jay on 2020/7/23.
 */
@MapperScan("com.jay.imall.product.dao")
@SpringBootApplication
public class ImallApplication {
    public static void main(String[] args) {
        SpringApplication.run(ImallApplication.class,args);
    }
}
