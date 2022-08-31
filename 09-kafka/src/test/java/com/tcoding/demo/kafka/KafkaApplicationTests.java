package com.tcoding.demo.kafka;

import com.tcoding.demo.kafka.consumer.KafkaConsumer;
import com.tcoding.demo.kafka.producer.KafkaSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class KafkaApplicationTests {

    @Autowired
    KafkaSender kafkaSender;

    @Autowired
    KafkaConsumer kafkaConsumer;

    @Test
    void KafkaTest() throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                kafkaSender.send("hello " + i);
            }
        });
        thread.start();
        TimeUnit.SECONDS.sleep(10);
    }
}
