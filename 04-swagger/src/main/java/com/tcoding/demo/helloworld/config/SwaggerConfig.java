package com.tcoding.demo.helloworld.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author 陈天成
 * @date 2022/8/27.
 */
@EnableOpenApi
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
            .apiInfo(apiInfo())
            .groupName("Normal")
            .enable(true)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.tcoding.demo.helloworld.controller"))
            .paths(PathSelectors.any())
            .build()
            .pathMapping("/");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            //标题
            .title("Spring Boot中使用Swagger3构建RESTful APIs")
            //简介
            .description("")
            //服务条款
            .termsOfServiceUrl("")

            //作者个人信息
            .contact(new Contact("tc", "", "1043023220@qq.com"))
            //版本
            .version("1.0").build();
    }
}

