package com.tcoding.demo.validator.contoller;

import com.tcoding.demo.validator.model.Book;
import com.tcoding.demo.validator.validator.annotation.In;
import org.springframework.validation.annotation.Validated;
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
@Validated
@RestController
@RequestMapping("/book")
public class IndexController {

    private Map<Integer, Book> map = Map.of(1, new Book(1, "math", "author", "math"),
        2, new Book(2, "chinese", "author", "chinese"));

    @PostMapping
    public String save(@Validated(Book.Save.class) @RequestBody Book book) {
        System.out.println(book);
        return book.getAuthor();
    }

    @PutMapping
    public String update(@Validated(Book.Update.class) @RequestBody Book book) {
        System.out.println(book);
        return book.getName();
    }

    @GetMapping
    public Book getById(@RequestParam("id") Integer id) {
        return map.get(id);
    }
    @GetMapping("/cat")
    public Book getByCategory(@In({"math","chinese"}) @RequestParam("category") String category ) {
        return map.get(1);
    }

}

