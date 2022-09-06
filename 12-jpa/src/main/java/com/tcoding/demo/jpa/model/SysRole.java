package com.tcoding.demo.jpa.model;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @TableName sys_role
 */
@Table(name = "sys_role")
@Data
@ToString(exclude = "users")
@Entity
public class SysRole {

    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     *
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     *
     */
    @Column(name = "c_time")
    private Date cTime;

    /**
     *
     */
    @Column(name = "u_time")
    private Date uTime;

    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private List<SysUser> users = new ArrayList<>();
}