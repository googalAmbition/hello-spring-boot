package com.tcoding.demoo.gson.config;

import com.google.gson.Gson;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;

import java.util.List;
import javax.annotation.Resource;

/**
 * @author 陈天成
 * @date 2022/9/7.
 */
@Configuration
public class MvcConfig extends DelegatingWebMvcConfiguration {

    @Resource
    private Gson gson;

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        GsonHttpMessageConverter gsonHttpMessageConverter = new GsonHttpMessageConverter();
        gsonHttpMessageConverter.setGson(gson);
        converters.add(gsonHttpMessageConverter);
    }
}

