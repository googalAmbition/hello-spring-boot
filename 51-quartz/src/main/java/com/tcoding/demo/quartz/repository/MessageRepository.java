package com.tcoding.demo.quartz.repository;

import com.tcoding.demo.quartz.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 陈天成
 * @date 2022/10/26.
 */
public interface MessageRepository extends JpaRepository<Message, Integer> {
}

