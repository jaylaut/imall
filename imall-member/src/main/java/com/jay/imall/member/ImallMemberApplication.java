package com.jay.imall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ImallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImallMemberApplication.class, args);
    }

}
