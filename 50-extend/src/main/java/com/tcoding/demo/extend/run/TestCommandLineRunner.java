package com.tcoding.demo.extend.run;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
@Component
public class TestCommandLineRunner implements CommandLineRunner, ApplicationRunner {

    @Override
    public void run(String... args) throws Exception {
        System.err.println("CommandLineRunner");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.err.println("ApplicationRunner");
    }
}

