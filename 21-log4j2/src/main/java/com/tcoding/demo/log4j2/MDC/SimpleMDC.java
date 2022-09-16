package com.tcoding.demo.log4j2.MDC;

import lombok.extern.log4j.Log4j2;
import org.slf4j.MDC;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/9/16.
 */
@Log4j2
@Component
public class SimpleMDC implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("-----SimpleMDC start -----");

        MDC.put("key1","value1");
        log.info("-----SimpleMDC put key1 -----");

        MDC.put("key2","value2");
        log.info("-----SimpleMDC put key2 -----");

        MDC.put("key3","value3");
        log.info("-----SimpleMDC put key3 -----");

        MDC.clear();
        log.info("-----SimpleMDC end -----");
    }
}

