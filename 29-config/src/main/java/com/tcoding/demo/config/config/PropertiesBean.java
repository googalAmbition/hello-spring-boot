package com.tcoding.demo.config.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/9/7.
 */
@Component
@Data
public class PropertiesBean {

    @Value("${my.properties.name}")
    private String name;
}

