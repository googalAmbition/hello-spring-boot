package com.tcoding.demo.reids;

import com.tcoding.demo.reids.helper.DemoService;
import com.tcoding.demo.reids.helper.RedisServiceHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class RedisApplicationTests {

    @Autowired
    RedisServiceHelper redisServiceHelper;

    @Autowired
    DemoService demoService;

    @Test
    void setString() {
        redisServiceHelper.set("test", "123");
        String s = (String) redisServiceHelper.get("test");
        System.out.println(s);
    }

    @Test
    void setList() {
        List<String> l = new ArrayList<>();
        l.add("12");
        l.add("22");
        redisServiceHelper.set("list", l);
        System.out.println(redisServiceHelper.get("list"));
    }

    @Test
    void cacheCache() {
        demoService.get(" world");
        demoService.get();
        Assertions.assertEquals(redisServiceHelper.get("test::get_ world"), " world");
        Assertions.assertEquals(redisServiceHelper.get("test::put"), "hello get");
    }

    @Test
    void delTest() {
        demoService.del();
    }
}
