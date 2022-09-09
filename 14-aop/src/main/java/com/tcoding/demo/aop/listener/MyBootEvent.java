package com.tcoding.demo.aop.listener;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * @author 陈天成
 * @date 2022/9/9.
 */
@Getter
@Setter
public class MyBootEvent extends ApplicationEvent {

    private String msg;

    public MyBootEvent(String msg) {
        super(msg);
        this.msg = msg;
    }
}

