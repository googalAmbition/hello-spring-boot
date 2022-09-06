package com.tcoding.demo.jpa.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @TableName user_file
 */
@Table(name = "user_file")
@Data
@ToString(exclude = "user")
@Entity
public class UserFile implements Serializable {

    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     *
     */
    @Column(name = "file_name")
    private String fileName;

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

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private SysUser user;
}