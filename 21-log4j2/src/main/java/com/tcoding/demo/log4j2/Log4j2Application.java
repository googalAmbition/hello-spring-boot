package com.tcoding.demo.log4j2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4j2Application {

    public static void main(String[] args) {
        //下面语句使得日志输出使用异步处理，减小输出日志对性能的影响
        System.setProperty("Log4jContextSelector", "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");
        SpringApplication.run(Log4j2Application.class, args);
    }


}
