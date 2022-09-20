package com.tcoding.demo.typesafe.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/9/20.
 */

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Value("${application.conf}")
    private String applicationConf;

    @Value("${application.yaml}")
    private String applicationYaml;

    @Value("${my.yaml}")
    private String myYaml;

    @Value("${my.conf}")
    private String myConf;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(applicationConf);
        System.out.println(applicationYaml);
        System.out.println(myConf);
        System.out.println(myYaml);
    }
}

