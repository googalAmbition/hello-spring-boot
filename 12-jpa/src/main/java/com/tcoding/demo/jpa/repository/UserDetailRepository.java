package com.tcoding.demo.jpa.repository;

import com.tcoding.demo.jpa.model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author 陈天成
 * @date 2022/9/5.
 */
public interface UserDetailRepository
    extends JpaRepository<UserDetail, Long>, JpaSpecificationExecutor<UserDetail> {

}

