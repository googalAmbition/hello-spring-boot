package com.tcoding.demo.retry.retry;

import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.CircuitBreaker;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author 陈天成
 * @date 2022/9/23.
 */
@Component
@Slf4j
public class RetryService {

    @Retryable(value = NullPointerException.class)
    public void retry() throws NullPointerException {
        log.info(" retry do at {}", LocalDateTime.now());
        throw new NullPointerException();
    }

    @Recover
    public void retry(NullPointerException e) {
        log.error("Recover error ", e);
    }

    @Retryable(value = NullPointerException.class, backoff = @Backoff(value = 2000, delay = 300))
    public void backoff() {
        log.info("backoff do at {}", LocalDateTime.now());
        throw new NullPointerException();
    }

    @CircuitBreaker(openTimeout = 2000, resetTimeout = 40000, value = NullPointerException.class)
    public void circuitBreaker() {
        log.info("circuitBreaker do at {}", LocalDateTime.now());
        throw new NullPointerException();
    }
}

