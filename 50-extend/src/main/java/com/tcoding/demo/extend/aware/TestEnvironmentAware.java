package com.tcoding.demo.extend.aware;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
@Component
public class TestEnvironmentAware implements EnvironmentAware {

    @Override
    public void setEnvironment(Environment environment) {
        System.err.println("TestEnvironmentAware->setEnvironment");
    }
}

