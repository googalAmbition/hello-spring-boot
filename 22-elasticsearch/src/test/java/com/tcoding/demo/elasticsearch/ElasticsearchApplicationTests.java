package com.tcoding.demo.elasticsearch;

import com.tcoding.demo.elasticsearch.model.Book;
import com.tcoding.demo.elasticsearch.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootTest
class ElasticsearchApplicationTests {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Test
    void saveTest() {
        Book book = new Book();
        book.setId(3);
        book.setAuthorName("tcoding");
        book.setBookName("hello spring boot");
        book.setRecordTime(LocalDateTime.now());
        bookRepository.save(book);
    }

    @Test
    void getTest(){
        Optional<Book> byId = bookRepository.findById(3);
        byId.ifPresent(System.out::println);
    }

    @Test
    void templateTet() {
        System.out.println(elasticsearchRestTemplate.get("3", Book.class));
    }
}
