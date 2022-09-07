package com.tcoding.demo.graphql.model;

import java.util.Arrays;
import java.util.List;

/**
 * @author 陈天成
 * @date 2022/9/6.
 */
public class Book {

    private static List<Book> books = Arrays.asList(
        new Book("book-1", "Harry Potter and the Philosopher's Stone", 223, "author-1"),
        new Book("book-2", "Moby Dick", 635, "author-2"),
        new Book("book-3", "Interview with the vampire", 371, "author-3")
                                                   );
    private String id;
    private String name;
    private int pageCount;
    private String authorId;

    public Book(String id, String name, int pageCount, String authorId) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.authorId = authorId;
    }

    public static Book getById(String id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }

    public String getAuthorId() {
        return authorId;
    }
}

