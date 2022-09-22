package com.tcoding.demo.neo4j;

import com.tcoding.demo.neo4j.modle.Book;
import com.tcoding.demo.neo4j.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    BookRepository bookRepository;

    @Test
    void contextLoads() {
        Book book = new Book();
        book.setName("hello");
        bookRepository.save(book);
    }

    @Test
    void list(){
        System.out.println(bookRepository.findAll());
    }
}
