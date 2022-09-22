package com.tcoding.demo.neo4j.modle;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

/**
 * @author 陈天成
 * @date 2022/9/22.
 */
@Data
@Node(labels = "book")
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
}

