package com.tcoding.demo.elasticsearch.repository;

import com.tcoding.demo.elasticsearch.model.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author 陈天成
 * @date 2022/9/6.
 */
public interface BookRepository extends ElasticsearchRepository<Book, Integer> {
}

