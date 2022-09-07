package com.tcoding.demo.config.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 陈天成
 * @date 2022/9/7.
 */

@Data
@ConfigurationProperties(prefix = "my.bean")
public class ConfigBean {

    private int id;

    private String name;
}

