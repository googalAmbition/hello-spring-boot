package com.tcoding.demo.mongo.repository;

import com.tcoding.demo.mongo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author 陈天成
 * @date 2022/9/6.
 */
public interface BookRepository extends MongoRepository<Book, Integer> {
}

