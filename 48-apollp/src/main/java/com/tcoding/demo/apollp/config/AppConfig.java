package com.tcoding.demo.apollp.config;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.springframework.context.annotation.Configuration;

import java.util.Set;
import javax.annotation.PostConstruct;

/**
 * @author 陈天成
 * @date 2022/9/26.
 */
@Configuration
public class AppConfig {

    @ApolloConfig
    private Config config;


    @ApolloConfigChangeListener
    private void configChangeListter(ConfigChangeEvent changeEvent) {
        refreshLoggingLevels();
    }

    @PostConstruct
    private void refreshLoggingLevels() {
        Set<String> keyNames = config.getPropertyNames();
        for (String key : keyNames) {
            System.out.println(key);
        }
    }
}

