package com.tcoding.demo.mongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author 陈天成
 * @date 2022/9/6.
 */
@Data
@Document(collection = "Book")
public class Book {

    @Id
    private int id;
    private String bookName;
    private String authorName;
}

