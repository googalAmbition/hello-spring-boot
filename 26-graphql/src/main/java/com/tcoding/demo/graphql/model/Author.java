package com.tcoding.demo.graphql.model;

import java.util.Arrays;
import java.util.List;

/**
 * @author 陈天成
 * @date 2022/9/6.
 */
public class Author {

    private static List<Author> authors = Arrays.asList(
        new Author("author-1", "Joanne", "Rowling"),
        new Author("author-2", "Herman", "Melville"),
        new Author("author-3", "Anne", "Rice")
                                                       );
    private String id;
    private String firstName;
    private String lastName;

    public Author(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static Author getById(String id) {
        return authors.stream().filter(author -> author.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }
}

