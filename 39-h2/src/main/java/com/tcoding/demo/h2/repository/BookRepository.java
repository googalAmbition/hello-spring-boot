package com.tcoding.demo.h2.repository;

import com.tcoding.demo.h2.modle.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import javax.annotation.Resource;

/**
 * @author 陈天成
 * @date 2022/9/20.
 */
@Repository
public class BookRepository {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public Book getById(Long id) {
        return jdbcTemplate.query("select * from book where id = " + id, (re, row) -> {
            Book book = new Book();
            book.setId(re.getLong(1));
            book.setName(re.getString(2));
            return book;
        }).get(0);
    }

    public List<Book> list() {
        List<Book> books = jdbcTemplate.query("select * from book ", (re, row) -> {
            Book book = new Book();
            book.setId(re.getLong(1));
            book.setName(re.getString(2));
            return book;
        });
        return books;
    }
}

