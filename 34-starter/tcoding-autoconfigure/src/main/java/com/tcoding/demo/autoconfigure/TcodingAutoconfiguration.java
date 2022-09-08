package com.tcoding.demo.autoconfigure;

import com.tcoding.demo.autoconfigure.backport.TcodingApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 陈天成
 * @date 2022/9/8.
 */
@Configuration
public class TcodingAutoconfiguration {

    @ConditionalOnClass(TcodingApplicationRunner.class)
    @Bean
    @ConditionalOnMissingBean(TcodingApplicationRunner.class)
    @ConditionalOnProperty(name = "tcoding.enabled", havingValue = "true", matchIfMissing = true)
    public TcodingApplicationRunner greetingApplicationRunner() {
        return new TcodingApplicationRunner();
    }
}

