package com.tcoding.demo.autoconfigure.backport;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * @author 陈天成
 * @date 2022/9/8.
 */
public class TcodingApplicationRunner implements ApplicationRunner {

    public TcodingApplicationRunner() {
        System.out.println("Initializing GreetingApplicationRunner.");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("Hello everyone! We all like Spring! ");
        System.out.println(args.getOptionNames());
    }
}

