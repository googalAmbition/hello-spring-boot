package com.tcoding.demo.spring.convert.controller;

import com.tcoding.demo.spring.convert.modle.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈天成
 * @date 2022/9/20.
 */
@RestController
public class BookController {

    @GetMapping("/book")
    public ResponseEntity<Book> getBook(@RequestParam("book") Book book) {
        return ResponseEntity.ok(book);
    }
}

