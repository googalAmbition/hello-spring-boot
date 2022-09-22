package com.tcoding.demo.rocketmq.mq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/9/22.
 */
@Slf4j
@Component
@RocketMQMessageListener(consumerGroup = "tcoding", topic = "demo")
public class Consumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String s) {
        log.info("------ {} ------", s);
    }
}

