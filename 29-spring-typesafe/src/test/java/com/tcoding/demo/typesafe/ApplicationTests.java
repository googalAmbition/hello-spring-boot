package com.tcoding.demo.typesafe;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {


    @Test
    void contextLoads() {
        System.out.println(System.getProperty("config.resource"));
    }
}
