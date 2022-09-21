package com.tcoding.demo.r2dbc.controller;

import com.tcoding.demo.r2dbc.modle.Book;
import com.tcoding.demo.r2dbc.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author 陈天成
 * @date 2022/9/21.
 */
@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping
    public Mono<Book> saveBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/{id}")
    public Mono<Book> findById(@PathVariable("id") Long id) {
        return bookRepository.findById(id);
    }

    @GetMapping
    public Flux<Book> getAll() {
        return bookRepository.findAll();
    }
}

