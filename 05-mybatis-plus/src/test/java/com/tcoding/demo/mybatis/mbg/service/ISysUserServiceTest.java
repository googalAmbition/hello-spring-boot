package com.tcoding.demo.mybatis.mbg.service;

import com.tcoding.demo.mybatis.MybatisPlusApplicationTests;
import com.tcoding.demo.mybatis.mbg.entity.SysUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 陈天成
 * @date 2022/8/29.
 */
class ISysUserServiceTest extends MybatisPlusApplicationTests {

    @Autowired
    private ISysUserService sysUserService;

    @DisplayName("mybatis plus type handler 测试")
    @Test
    public void sysUserTest() {
        SysUser user = new SysUser();
        user.setPassword("123456");
        user.setPhoneNumber("111");
        user.setUserName("mybatis plus");
        user.setGroupId(1L);
        sysUserService.save(user);

        SysUser dbUser = sysUserService.getById(user.getId());
        Assertions.assertEquals(user.getUserName(), dbUser.getUserName());
    }
}