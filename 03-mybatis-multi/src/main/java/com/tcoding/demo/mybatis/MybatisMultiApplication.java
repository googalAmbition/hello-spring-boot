package com.tcoding.demo.mybatis;

import com.tcoding.demo.mybatis.mbg.mapper1.SysUserMapper1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisMultiApplication {

    @Autowired
    SysUserMapper1 sysUserMapper1;

    public static void main(String[] args) {
        SpringApplication.run(MybatisMultiApplication.class, args);
    }
}
