// package com.tcoding.demo.jackson.config;
//
// import com.fasterxml.jackson.databind.ObjectMapper;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.http.converter.HttpMessageConverter;
// import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
// import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
//
// import java.util.List;
//
// /**
//  * @author 陈天成
//  * @date 2022/9/7.
//  */
// @Configuration
// public class MvcConfig extends DelegatingWebMvcConfiguration {
//
//     @Autowired
//     private ObjectMapper objectMapper;
//
//     @Override
//     public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//         MappingJackson2HttpMessageConverter convert = new MappingJackson2HttpMessageConverter(objectMapper);
//         converters.add(convert);
//     }
// }
//
