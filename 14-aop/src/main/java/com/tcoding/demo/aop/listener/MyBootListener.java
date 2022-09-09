package com.tcoding.demo.aop.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/9/9.
 */
@Component
public class MyBootListener implements ApplicationListener<MyBootEvent> {

    @Override
    public void onApplicationEvent(MyBootEvent event) {
        System.out.println("MyBootListener  " + event.getMsg());
    }
}

