package com.tcoding.demo.config;

import com.tcoding.demo.config.config.ConfigBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
class ConfigApplicationTests {

    @Autowired
    ConfigBean configBean;

    @Test
    void contextLoads() {
        Assertions.assertEquals(configBean.getId(),1);
        Assertions.assertEquals(configBean.getName(),"dev-tcoding");
    }
}
