package com.tcoding.demo.retry;

import com.tcoding.demo.retry.retry.RetryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class ApplicationTests {

    @Autowired
    RetryService retryService;

    @Test
    void contextLoads() {
        retryService.retry();
    }

    @Test
    void retry() {
        retryService.retry();
    }

    @Test
    void testRetry() {

    }

    @Test
    void backoff() {
        retryService.backoff();
    }

    @Test
    void circuitBreaker() throws InterruptedException {

        for (int i = 0; i < 20; i++) {
            TimeUnit.MILLISECONDS.sleep(500);
            retryService.circuitBreaker();
        }
    }
}
