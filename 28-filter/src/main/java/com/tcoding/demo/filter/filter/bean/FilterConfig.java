package com.tcoding.demo.filter.filter.bean;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<FilterBean1> filterbean1() {
        FilterRegistrationBean<FilterBean1> registration = new FilterRegistrationBean<>(new FilterBean1());
        registration.addUrlPatterns("/bean", "/all");
        registration.setName("bean-filter3");
        registration.setOrder(3);
        return registration;
    }

    @Bean
    public FilterRegistrationBean<FilterBean2> filterbean2() {
        FilterRegistrationBean<FilterBean2> registration = new FilterRegistrationBean<>(new FilterBean2());
        registration.addUrlPatterns("/bean", "/all");
        registration.setName("bean-filter4");
        registration.setOrder(4);
        return registration;
    }
}

