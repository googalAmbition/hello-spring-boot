package com.tcoding.demo.aop.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/9/9.
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Autowired
    private MyBootPublish myBootPublish;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        myBootPublish.publish();
        System.out.println("MyApplicationRunner  " + args.getNonOptionArgs());
        System.out.println("MyApplicationRunner  " + args.getOptionNames());
    }
}

