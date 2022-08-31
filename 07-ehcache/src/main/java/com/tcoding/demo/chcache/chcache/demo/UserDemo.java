package com.tcoding.demo.chcache.chcache.demo;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/8/31.
 */
@Component
@CacheConfig(cacheNames = "user")
public class UserDemo {

    @Cacheable(key = "#id")
    public String getUserById(Long id) {
        return "name";
    }

    @CachePut(key = "#id")
    public String update(Long id) {
        return "hello";
    }

    @CacheEvict(key = "#id")
    public String dle(Long id) {
        return "del";
    }
}

