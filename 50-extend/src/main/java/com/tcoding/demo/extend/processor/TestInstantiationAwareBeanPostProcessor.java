package com.tcoding.demo.extend.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
@Component
public class TestInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        // System.out.println("TestInstantiationAwareBeanPostProcessor->postProcessBeforeInstantiation"+ "->" + beanName);
        return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        // System.out.println("TestInstantiationAwareBeanPostProcessor->postProcessAfterInstantiation"+ "->" + beanName);
        return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        // System.out.println("TestInstantiationAwareBeanPostProcessor->postProcessProperties"+ "->" + beanName);
        return InstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // System.out.println("TestInstantiationAwareBeanPostProcessor->postProcessBeforeInitialization" + "->" + beanName);
        return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // System.out.println("TestInstantiationAwareBeanPostProcessor->postProcessAfterInitialization"+ "->" + beanName);
        return InstantiationAwareBeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}

