package com.tcoding.demo.spring.convert.config;

import com.tcoding.demo.spring.convert.convert.BookConvert;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;

/**
 * @author 陈天成
 * @date 2022/9/20.
 */
@Configuration
public class WebConfig extends DelegatingWebMvcConfiguration {

    @Override
    protected void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new BookConvert());
    }
}

