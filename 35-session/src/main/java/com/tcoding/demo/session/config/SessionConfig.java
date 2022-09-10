package com.tcoding.demo.session.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.web.http.DefaultCookieSerializer;

/**
 * @author 陈天成
 * @date 2022/9/11.
 */
@Configuration
public class SessionConfig {

    @Bean
    public DefaultCookieSerializer defaultCookieSerializer() {
        DefaultCookieSerializer defaultCookieSerializer = new DefaultCookieSerializer();
        defaultCookieSerializer.setCookiePath("/");
        defaultCookieSerializer.setDomainName("127.0.0.1");
        return defaultCookieSerializer;
    }
}

