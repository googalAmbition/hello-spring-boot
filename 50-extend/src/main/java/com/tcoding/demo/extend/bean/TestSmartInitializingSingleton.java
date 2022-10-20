package com.tcoding.demo.extend.bean;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
@Component
public class TestSmartInitializingSingleton implements SmartInitializingSingleton {

    @Override
    public void afterSingletonsInstantiated() {
        String method = Thread.currentThread().getStackTrace()[1].getMethodName();
        String clazz = this.getClass().getSimpleName();
        System.err.println(clazz + "->" + method);
    }
}

