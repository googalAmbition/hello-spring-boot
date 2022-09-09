package com.tcoding.demo.aop.controller;

import com.tcoding.demo.aop.aspect.LogAop;
import com.tcoding.demo.aop.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author 陈天成
 * @date 2022/9/7.
 */
@RestController
@RequestMapping("/book")
public class IndexController {

    private Map<Integer, Book> map = Map.of(1, new Book(1, "math", "author", "math"),
        2, new Book(2, "chinese", "author", "chinese"));

    @LogAop
    @PostMapping
    public String save(@RequestBody Book book) {
        System.out.println(book);
        return book.getAuthor();
    }

    @LogAop
    @PutMapping
    public String update(@RequestBody Book book) {
        System.out.println(book);
        return book.getName();
    }

    @LogAop
    @GetMapping
    public Book getById(@RequestParam("id") Integer id) {
        return map.get(id);
    }
}

