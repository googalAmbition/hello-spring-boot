package com.tcoding.demo.shardingsphere.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 陈天成
 * @date 2022/9/13.
 */
@Data
@Entity
@Table(name = "sys_user")
public class SysUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", length = 20)
    private String userName;

    private Long groupId;

    private String password;

    private String phoneNumber;

    private Date cTime;

    private Date uTime;
}

