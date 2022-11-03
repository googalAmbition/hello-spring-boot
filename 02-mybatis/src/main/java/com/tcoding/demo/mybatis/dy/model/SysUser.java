package com.tcoding.demo.mybatis.dy.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

/**
 * Table: sys_user
 */
public class SysUser implements Serializable {
    /**
     * Table:     sys_user
     * Column:    id
     * Nullable:  false
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.245051+08:00", comments="Source field: sys_user.id")
    private Long id;

    /**
     * Table:     sys_user
     * Column:    user_name
     * Nullable:  false
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.248+08:00", comments="Source field: sys_user.user_name")
    private String userName;

    /**
     * Table:     sys_user
     * Column:    user_detail_id
     * Nullable:  true
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.248207+08:00", comments="Source field: sys_user.user_detail_id")
    private Long userDetailId;

    /**
     * Table:     sys_user
     * Column:    group_id
     * Nullable:  false
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.248418+08:00", comments="Source field: sys_user.group_id")
    private Long groupId;

    /**
     * Table:     sys_user
     * Column:    password
     * Nullable:  false
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.248587+08:00", comments="Source field: sys_user.password")
    private String password;

    /**
     * Table:     sys_user
     * Column:    phone_number
     * Nullable:  false
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.248785+08:00", comments="Source field: sys_user.phone_number")
    private String phoneNumber;

    /**
     * Table:     sys_user
     * Column:    c_time
     * Nullable:  true
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.248971+08:00", comments="Source field: sys_user.c_time")
    private Date cTime;

    /**
     * Table:     sys_user
     * Column:    u_time
     * Nullable:  true
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.24929+08:00", comments="Source field: sys_user.u_time")
    private Date uTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.249659+08:00", comments="Source Table: sys_user")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.247487+08:00", comments="Source field: sys_user.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.247914+08:00", comments="Source field: sys_user.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.248069+08:00", comments="Source field: sys_user.user_name")
    public String getUserName() {
        return userName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.248153+08:00", comments="Source field: sys_user.user_name")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.248302+08:00", comments="Source field: sys_user.user_detail_id")
    public Long getUserDetailId() {
        return userDetailId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.248366+08:00", comments="Source field: sys_user.user_detail_id")
    public void setUserDetailId(Long userDetailId) {
        this.userDetailId = userDetailId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.248477+08:00", comments="Source field: sys_user.group_id")
    public Long getGroupId() {
        return groupId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.248536+08:00", comments="Source field: sys_user.group_id")
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.248647+08:00", comments="Source field: sys_user.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.248728+08:00", comments="Source field: sys_user.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.248854+08:00", comments="Source field: sys_user.phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.248914+08:00", comments="Source field: sys_user.phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.2491+08:00", comments="Source field: sys_user.c_time")
    public Date getcTime() {
        return cTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.249191+08:00", comments="Source field: sys_user.c_time")
    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.249395+08:00", comments="Source field: sys_user.u_time")
    public Date getuTime() {
        return uTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-11-02T17:30:48.249481+08:00", comments="Source field: sys_user.u_time")
    public void setuTime(Date uTime) {
        this.uTime = uTime;
    }
}