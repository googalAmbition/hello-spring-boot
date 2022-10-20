package com.tcoding.demo.extend.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
@Component
public class TestSmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        // 打印太多
        // System.out.println("TestSmartInstantiationAwareBeanPostProcessor->predictBeanType" + "->" + beanName);
        return SmartInstantiationAwareBeanPostProcessor.super.predictBeanType(beanClass, beanName);
    }

    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        // System.out.println("TestSmartInstantiationAwareBeanPostProcessor->determineCandidateConstructors" + "->" + beanName);
        return SmartInstantiationAwareBeanPostProcessor.super.determineCandidateConstructors(beanClass, beanName);
    }

    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        // System.out.println("TestSmartInstantiationAwareBeanPostProcessor->getEarlyBeanReference" + "->" + beanName);
        return SmartInstantiationAwareBeanPostProcessor.super.getEarlyBeanReference(bean, beanName);
    }
}

