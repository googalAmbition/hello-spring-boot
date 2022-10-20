package com.tcoding.demo.extend.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
@Component
public class TestDisposableBean implements DisposableBean {

    @Override
    public void destroy() throws Exception {
        String method = Thread.currentThread().getStackTrace()[1].getMethodName();
        String clazz = this.getClass().getSimpleName();
        System.err.println(clazz + "->" + method);
    }
}

