package com.tcoding.demo.extend.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
@Component
public class TestBeanNameAware implements BeanNameAware {

    @Override
    public void setBeanName(String s) {
        String method = Thread.currentThread().getStackTrace()[1].getMethodName();
        String clazz = this.getClass().getSimpleName();
        System.out.println(clazz + "->" + method + "->" + s);
    }
}

