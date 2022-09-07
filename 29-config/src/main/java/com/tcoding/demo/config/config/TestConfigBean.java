package com.tcoding.demo.config.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/9/7.
 */
@ConfigurationProperties(prefix = "test")
@Component
@PropertySource("classpath:test.yaml")
@Data
public class TestConfigBean {

    private String name;
    private int age;
}

