package com.tcoding.demo.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * @author 陈天成
 * @date 2022/8/31.
 */
@Component
public class KafkaConsumer {

    /**
     * 单条消费
     * @param record
     */
    @KafkaListener(topics = {"tcoding"}, groupId = "tcoding1")
    public void listen(ConsumerRecord<String, String> record) {

        Optional.ofNullable(record.value())
            .ifPresent(System.out::println);
    }

    /**
     * 批量消费
     * @param records
     */
    @KafkaListener(topics = {"tcoding"}, containerFactory = "kafkaListenerContainerFactory")
    public void batchListen(List<ConsumerRecord<String, String>> records) {
        for (ConsumerRecord<String, String> record: records) {
            Optional.ofNullable(record.value())
                .ifPresent(System.out::println);
        }
    }
}

