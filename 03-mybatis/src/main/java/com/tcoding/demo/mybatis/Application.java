package com.tcoding.demo.mybatis;

import com.tcoding.demo.mybatis.mbg.mapper1.SysUserMapper1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@SpringBootApplication
public class Application {

    @Autowired
    SysUserMapper1 sysUserMapper1;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/test")
    public String string() {
        return sysUserMapper1.selectByPrimaryKey(1L).getUserName();
    }
}
