package com.tcoding.demo.hateoas.controller;

import com.tcoding.demo.hateoas.modle.Book;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author 陈天成
 * @date 2022/9/10.
 */
@RestController
public class BookController {

    private List<Book> list = List.of(new Book(1L, "name1", "author1"),
        new Book(2L, "name2", "author2"),
        new Book(3L, "name3", "author3")
                                     );

    private Map<Long, Book> id2bookMap = list.stream().collect(Collectors.toMap(Book::getId, x -> x));
    private Map<String, Book> name2bookMap = list.stream().collect(Collectors.toMap(Book::getBookName, x -> x));

    @GetMapping("/{id}")
    public HttpEntity<Book> get(@PathVariable("id") Long id) {
        Book book = id2bookMap.get(id);
        book.add(linkTo(methodOn(BookController.class).get(id)).withSelfRel());
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @GetMapping
    public HttpEntity<List<Book>> get() {
        List<Book> collect = list.stream().map(x ->
        {
            x.add(linkTo(methodOn(BookController.class).get(x.getId())).withSelfRel());
            x.add(linkTo(methodOn(BookController.class).getByName(x.getBookName())).withSelfRel());
            return x;
        }).collect(Collectors.toList());
        return new ResponseEntity<>(collect, HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    public HttpEntity<Book> getByName(@PathVariable("name") String name) {
        Book book = name2bookMap.get(name);
        book.add(linkTo(methodOn(BookController.class).getByName(book.getBookName())).withSelfRel());
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
}

