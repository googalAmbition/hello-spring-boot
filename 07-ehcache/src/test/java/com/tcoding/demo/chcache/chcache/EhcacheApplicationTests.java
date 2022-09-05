package com.tcoding.demo.chcache.chcache;

import com.tcoding.demo.chcache.chcache.demo.UserDemo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EhcacheApplicationTests {

    @Autowired
    UserDemo userDemo;

    @Test
    void userDemoTest() {
        userDemo.getUserById(1L);
        userDemo.getUserById(1L);
        userDemo.getUserById(1L);
    }
}
