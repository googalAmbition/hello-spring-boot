package com.tcoding.demo.extend.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 陈天成
 * @date 2022/10/20.
 * 在容器刷新之前调用此类的initialize方法
 *
 * 1. springApplication.addInitializers(new TestApplicationContextInitializer())
 * 2. context.initializer.classes=com.tcoding.demo.extend.context.TestApplicationContextInitializer
 * 3. Spring SPI扩展，在spring.factories中加入org.springframework.context.ApplicationContextInitializer=com.tcoding.demo.extend.context
 * .TestApplicationContextInitializer
 */
public class TestApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.err.println("ApplicationContextInitializer");
    }
}

