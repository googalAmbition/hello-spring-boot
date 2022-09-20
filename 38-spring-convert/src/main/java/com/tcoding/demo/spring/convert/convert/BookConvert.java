package com.tcoding.demo.spring.convert.convert;

import com.tcoding.demo.spring.convert.modle.Book;
import org.springframework.core.convert.converter.Converter;

/**
 * @author 陈天成
 * @date 2022/9/20.
 */
public class BookConvert implements Converter<String, Book> {

    @Override
    public Book convert(String source) {
        String[] data = source.split(",");
        return new Book(Long.parseLong(data[0]), data[1]);
    }
}

