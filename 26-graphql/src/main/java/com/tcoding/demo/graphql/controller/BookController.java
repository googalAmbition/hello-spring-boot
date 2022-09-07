package com.tcoding.demo.graphql.controller;

import com.tcoding.demo.graphql.model.Author;
import com.tcoding.demo.graphql.model.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈天成
 * @date 2022/9/6.
 */
@RestController
public class BookController {

    @QueryMapping
    public Book bookById(@Argument String id) {
        return Book.getById(id);
    }

    @SchemaMapping
    public Author author(Book book) {
        return Author.getById(book.getAuthorId());
    }
}

