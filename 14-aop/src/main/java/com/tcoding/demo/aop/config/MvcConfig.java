package com.tcoding.demo.aop.config;

import com.tcoding.demo.aop.aspect.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

/**
 * @author 陈天成
 * @date 2022/9/9.
 */
@Configuration
public class MvcConfig extends DelegatingWebMvcConfiguration {

    @Autowired
    private MyInterceptor myInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor);
    }
}

