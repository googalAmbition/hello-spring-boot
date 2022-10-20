package com.tcoding.demo.extend.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
@Component
public class TestBeanFactoryAware implements BeanFactoryAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.err.println("TestBeanFactoryAware->setBeanFactory");
    }
}

