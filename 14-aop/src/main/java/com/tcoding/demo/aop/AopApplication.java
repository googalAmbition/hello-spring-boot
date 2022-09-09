package com.tcoding.demo.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopApplication {

    public static void main(String[] args) {
        args = new String[] {"--for=bar", ""};
        SpringApplication.run(AopApplication.class, args);
    }
}
