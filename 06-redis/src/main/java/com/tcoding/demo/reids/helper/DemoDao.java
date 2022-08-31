package com.tcoding.demo.reids.helper;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * @author 陈天成
 * @date 2022/8/30.
 */
@Repository
public class DemoDao {

    /**
     * 默认生成的key格式为：cacheNames::key
     */
    @Cacheable(cacheNames = "test", key = "'get_'+#name", unless = "#result == null ")
    public String get(String name) {
        return name;
    }

    @CachePut(cacheNames = "test", key = "'put'")
    public String get() {
        return "hello get";
    }

    @CacheEvict(cacheNames = "test", key = "'del'")
    public String dle() {
        return "del";
    }
}

