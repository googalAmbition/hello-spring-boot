package com.tcoding.demo.kafka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;

/**
 * @author 陈天成
 * @date 2022/8/31.
 */
@Configuration
public class KafkaConfig {

    /**
     *
     */
    @Primary
    @Bean
    public ConcurrentKafkaListenerContainerFactory<?, ?> kafkaListenerContainerFactoryPrimary(
        ConcurrentKafkaListenerContainerFactory<?, ?> kafkaListenerContainerFactory) {
        kafkaListenerContainerFactory.setBatchListener(true);
        return kafkaListenerContainerFactory;
    }
}

