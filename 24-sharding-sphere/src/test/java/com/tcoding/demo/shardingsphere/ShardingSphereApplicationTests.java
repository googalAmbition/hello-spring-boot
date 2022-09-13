package com.tcoding.demo.shardingsphere;

import com.tcoding.demo.shardingsphere.model.SysUser;
import com.tcoding.demo.shardingsphere.repository.SysUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingSphereApplicationTests {

    @Autowired
    SysUserRepository sysUserRepository;


    @Test
    void contextLoads() {
        for (long i = 100L; i < 110L; i++) {
            SysUser user = new SysUser();
            // user.setId(i);
            user.setUserName("sharding");
            user.setGroupId(1L);
            user.setPassword("123456");
            user.setPhoneNumber("123456");
            sysUserRepository.save(user);
        }

    }
}
