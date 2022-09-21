package com.tcoding.demo.r2dbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

@SpringBootApplication
@EnableR2dbcAuditing
public class R2dbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(R2dbcApplication.class, args);
    }
}
