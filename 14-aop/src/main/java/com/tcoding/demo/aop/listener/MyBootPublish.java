package com.tcoding.demo.aop.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/9/9.
 */
@Component
public class MyBootPublish {

    @Autowired
    private ApplicationContext applicationContext;

    public void publish() {
        MyBootEvent event = new MyBootEvent("test msg");
        applicationContext.publishEvent(event);
    }
}

