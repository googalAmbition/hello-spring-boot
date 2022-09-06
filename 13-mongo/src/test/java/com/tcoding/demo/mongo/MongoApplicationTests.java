package com.tcoding.demo.mongo;

import com.tcoding.demo.mongo.model.Book;
import com.tcoding.demo.mongo.repository.BookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import javax.annotation.Resource;

@SpringBootTest
class MongoApplicationTests {

    @Autowired
    BookRepository bookRepository;

    @Test
    void saveTest() {
        Book book = new Book();
        book.setId(1);
        book.setBookName("hello spring boot");
        book.setAuthorName("tcoding");
        bookRepository.save(book);
        System.out.println(book.getId());
    }

    @Test
    void findTest() {
        Optional<Book> book = bookRepository.findById(1);
        Assertions.assertEquals(book.orElse(new Book()).getAuthorName(), "tcoding");
    }

    @Test
    void delTest() {
        bookRepository.deleteById(1);
    }
    // @Test
    // void saveTest() {
    // }
}
