package com.tcoding.demo.extend.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
public class TestFactoryBean implements FactoryBean<TestFactoryBean.TestFactoryInnerBean> {

    @Override
    public TestFactoryInnerBean getObject() throws Exception {
        String method = Thread.currentThread().getStackTrace()[1].getMethodName();
        String clazz = this.getClass().getSimpleName();
        System.out.println(clazz + "->" + method);
        return new TestFactoryInnerBean();
    }

    @Override
    public Class<?> getObjectType() {
        String method = Thread.currentThread().getStackTrace()[1].getMethodName();
        String clazz = this.getClass().getSimpleName();
        System.out.println(clazz + "->" + method);
        return TestFactoryInnerBean.class;
    }

    @Override
    public boolean isSingleton() {
        String method = Thread.currentThread().getStackTrace()[1].getMethodName();
        String clazz = this.getClass().getSimpleName();
        System.out.println(clazz + "->" + method);
        return true;
    }

    public static class TestFactoryInnerBean{

    }
}

