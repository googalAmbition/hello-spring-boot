package com.tcoding.demo.validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ValidatorApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ValidatorApplication.class, args);
    }
}
