package com.tcoding.demo.neo4j.repository;

import com.tcoding.demo.neo4j.modle.Book;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @author 陈天成
 * @date 2022/9/22.
 */
public interface BookRepository extends Neo4jRepository<Book, Long> {

}

