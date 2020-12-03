package com.hancher.learn.maindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MainDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainDemoApplication.class, args);
    }

}
