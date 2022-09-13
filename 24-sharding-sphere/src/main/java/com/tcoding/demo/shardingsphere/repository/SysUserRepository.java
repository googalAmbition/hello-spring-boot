package com.tcoding.demo.shardingsphere.repository;

import com.tcoding.demo.shardingsphere.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author 陈天成
 * @date 2022/9/5.
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long>, JpaSpecificationExecutor<SysUser> {

}

