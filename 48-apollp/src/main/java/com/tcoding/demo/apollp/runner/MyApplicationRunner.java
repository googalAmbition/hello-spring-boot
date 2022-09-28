package com.tcoding.demo.apollp.runner;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author 陈天成
 * @date 2022/9/26.
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {



    @Override
    public void run(ApplicationArguments args) throws Exception {
        Config appConfig = ConfigService.getAppConfig();
        String test = appConfig.getProperty("test", "0");
        System.out.println(test);
    }
}

