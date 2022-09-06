package com.tcoding.demo.webflux.service;

import com.tcoding.demo.webflux.model.Book;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 陈天成
 * @date 2022/9/6.
 */
@Repository
public class BookService {

    public static final AtomicInteger ID_GEN = new AtomicInteger(0);
    private ConcurrentMap<Integer, Book> repository = new ConcurrentHashMap<>();

    public Integer save(Book book) {
        int i = ID_GEN.incrementAndGet();
        book.setId(i);
        repository.put(i, book);
        return i;
    }

    public Collection<Book> findAll() {
        return repository.values();
    }

    public Book findBookById(Integer id) {
        return repository.get(id);
    }

    public Integer updateBook(Book book) {
        repository.put(book.getId(), book);
        return book.getId();
    }

    public Integer deleteBook(Integer id) {
        repository.remove(id);
        return id;
    }
}

