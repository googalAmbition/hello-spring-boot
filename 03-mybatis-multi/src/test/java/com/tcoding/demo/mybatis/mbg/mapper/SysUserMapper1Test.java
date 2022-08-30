package com.tcoding.demo.mybatis.mbg.mapper;

import com.tcoding.demo.mybatis.MybatisMultiApplicationTests;
import com.tcoding.demo.mybatis.mbg.mapper1.SysUserMapper1;
import com.tcoding.demo.mybatis.mbg.mapper2.SysUserMapper2;
import com.tcoding.demo.mybatis.mbg.model.SysUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 陈天成
 * @date 2022/8/27.
 */
public class SysUserMapper1Test extends MybatisMultiApplicationTests {

    @Autowired
    private SysUserMapper1 sysUserMapper1;

    @Autowired
    private SysUserMapper2 sysUserMapper2;

    @DisplayName("多数据库test")
    @Test
    void multiDbTest() {
        SysUser u1 = sysUserMapper1.selectByPrimaryKey(1L);
        SysUser u2 = sysUserMapper2.selectByPrimaryKey(1L);
        Assertions.assertEquals(u1.getUserName(), "tcoding1");
        Assertions.assertEquals(u2.getUserName(), "tcoding2");
    }
}