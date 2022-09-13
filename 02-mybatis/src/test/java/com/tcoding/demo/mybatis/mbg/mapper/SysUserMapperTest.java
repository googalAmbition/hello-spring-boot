package com.tcoding.demo.mybatis.mbg.mapper;

import com.tcoding.demo.mybatis.MybatisApplicationTests;
import com.tcoding.demo.mybatis.mbg.model.SysUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 陈天成
 * @date 2022/8/27.
 */
public class SysUserMapperTest extends MybatisApplicationTests {

    @Autowired
    private SysUserMapper sysUserMapper;

    @DisplayName("type handler 测试 ")
    @Test
    void typeHandlerTest() {
        SysUser u = new SysUser();
        u.setGroupId(1L);
        u.setPassword("123456");
        u.setUserName("encrypt");
        u.setPhoneNumber("123456");
        sysUserMapper.insert(u);
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(u.getId());
        Assertions.assertEquals(u.getPassword(), sysUser.getPassword());
    }
}