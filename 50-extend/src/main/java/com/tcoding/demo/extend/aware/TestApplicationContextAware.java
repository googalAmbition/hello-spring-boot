package com.tcoding.demo.extend.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
@Component
public class TestApplicationContextAware implements ApplicationContextAware {

    private static ApplicationContext context;

    public static ApplicationContext getContext() {
        return context;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
        String method = Thread.currentThread().getStackTrace()[1].getMethodName();
        String clazz = this.getClass().getSimpleName();
        System.out.println(clazz + "->" + method);
    }
}

