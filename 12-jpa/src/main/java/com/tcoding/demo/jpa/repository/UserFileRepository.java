package com.tcoding.demo.jpa.repository;

import com.tcoding.demo.jpa.model.UserFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * @author 陈天成
 * @date 2022/9/5.
 */
public interface UserFileRepository
    extends JpaRepository<UserFile, Long>, JpaSpecificationExecutor<UserFile>, CrudRepository<UserFile, Long> {

}

