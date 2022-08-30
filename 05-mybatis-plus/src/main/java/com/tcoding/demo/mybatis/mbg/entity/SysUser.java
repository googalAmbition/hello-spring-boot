package com.tcoding.demo.mybatis.mbg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.tcoding.demo.mybatis.mbg.handler.EncryptTypeHandler;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author tc
 * @since 2022-08-29
 */
@TableName(value = "sys_user", autoResultMap = true)
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String userName;

    private Long groupId;

    @TableField(typeHandler = EncryptTypeHandler.class)
    private String password;

    @TableField(typeHandler = EncryptTypeHandler.class)
    private String phoneNumber;

    private LocalDateTime cTime;

    private LocalDateTime uTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDateTime getcTime() {
        return cTime;
    }

    public void setcTime(LocalDateTime cTime) {
        this.cTime = cTime;
    }

    public LocalDateTime getuTime() {
        return uTime;
    }

    public void setuTime(LocalDateTime uTime) {
        this.uTime = uTime;
    }

    @Override
    public String toString() {
        return "SysUser{" +
            "id = " + id +
            ", userName = " + userName +
            ", groupId = " + groupId +
            ", password = " + password +
            ", phoneNumber = " + phoneNumber +
            ", cTime = " + cTime +
            ", uTime = " + uTime +
            "}";
    }
}
