package com.tcoding.demo.aop.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author 陈天成
 * @date 2022/9/9.
 */
@Component
public class MyCommandLine implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandLine " + Arrays.asList(args));
    }
}

