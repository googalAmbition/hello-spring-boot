package com.tcoding.demo.h2;

import com.tcoding.demo.h2.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class H2ApplicationTests {

    @Autowired
    BookRepository bookRepository;

    @Test
    void contextLoads() {
        System.out.println(bookRepository.getById(1L));
    }
    @Test
    void contextLoads1() {
        System.out.println(bookRepository.list());
    }
}
