package com.tcoding.demo.kafka.producer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tcoding.demo.kafka.Message;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author 陈天成
 * @date 2022/8/31.
 */
@Component
public class KafkaSender {

    private final KafkaTemplate<String, String> kafkaTemplate;

    //构造器方式注入  kafkaTemplate
    public KafkaSender(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    private Gson gson = new GsonBuilder().create();

    public void send(String msg) {
        System.out.println(msg);
        Message message = new Message();

        message.setId(System.currentTimeMillis());
        message.setName(msg);
        message.setDateTime(LocalDateTime.now());

        //对 topic =  hello2 的发送消息
        kafkaTemplate.send("tcoding",gson.toJson(message));
    }
}

