package com.tcoding.demo.rocketmq.mq;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 陈天成
 * @date 2022/9/22.
 */
@Component
public class Producer {

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    public void sendMessage(String msg) {
        rocketMQTemplate.convertAndSend("demo", msg);
    }
}

