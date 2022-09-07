package com.tcoding.demoo.gson.controller;

import com.tcoding.demoo.gson.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author 陈天成
 * @date 2022/9/7.
 */
@RestController
@RequestMapping("/book")
public class IndexController {

    @PostMapping
    public Book save(@RequestBody Book book) {
        return book;
    }

    @GetMapping
    public Book get() {
        Book book = new Book();
        book.setId(1L);
        book.setName("tcoding");
        book.setCreateTime(LocalDateTime.now());
        book.setPublishDate(LocalDate.now());
        return book;
    }
}

