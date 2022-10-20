package com.tcoding.demo.extend.anootation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
@Component
public class Javax {

    @PostConstruct
    public void init(){
        System.err.println("@PostConstruct");
    }

    @PreDestroy
    public void destroy(){
        System.err.println("@PreDestroy");
    }
}

