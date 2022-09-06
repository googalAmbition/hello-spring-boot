package com.tcoding.demo.webflux.controller;

import com.tcoding.demo.webflux.model.Book;
import com.tcoding.demo.webflux.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author 陈天成
 * @date 2022/9/6.
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Mono<Integer> saveBook(@RequestBody Book book) {
        return Mono.create(x -> x.success(bookService.save(book)));
    }

    @GetMapping("/{id}")
    public Mono<Book> findById(@PathVariable("id") Integer id) {
        return Mono.justOrEmpty(bookService.findBookById(id));
    }

    @GetMapping
    public Flux<Book> getAll(){
        return Flux.fromIterable(bookService.findAll());
    }

}

