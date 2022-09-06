package com.tcoding.demo.jpa.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @TableName user_detail
 */
@Table(name = "user_detail")
@Entity
@Data
@ToString(exclude = "user")
public class UserDetail {

    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     *
     */
    @Column(name = "detail_info")
    private String detailInfo;

    // @Column(name = "user_id")
    // private Long userId;

    @OneToOne(mappedBy = "userDetail")
    private SysUser user;
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
}