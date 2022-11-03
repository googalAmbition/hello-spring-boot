package com.tcoding.demo.mybatis.dy;

import com.tcoding.demo.mybatis.MybatisApplicationTests;

/**
 * @author 陈天成
 * @date 2022/11/2.
 */

public class SysUserMapperTest extends MybatisApplicationTests {

    // @Autowired
    // private SysUserMapper sysUserDyMapper;
    // @Test
    // public void dynamicTest(){
    //     SysUser user = new SysUser();
    //     user.setUserName("dynamic");
    //     user.setUserDetailId(1L);
    //     user.setGroupId(2L);
    //     user.setPassword("123456");
    //     user.setPhoneNumber("4343323");
    //
    //     sysUserDyMapper.insert(user);
    //
    //     System.out.println(sysUserDyMapper.selectDistinct(c -> c.where(SysUserDynamicSqlSupport.password, SqlBuilder.isEqualTo("123456"))));
    // }
}

