package com.tcoding.demo.r2dbc.repository;

import com.tcoding.demo.r2dbc.modle.Book;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

/**
 * @author 陈天成
 * @date 2022/9/21.
 */
public interface BookRepository extends R2dbcRepository<Book, Long> {
}

