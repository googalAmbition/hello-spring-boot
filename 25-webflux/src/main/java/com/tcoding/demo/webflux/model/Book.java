package com.tcoding.demo.webflux.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author 陈天成
 * @date 2022/9/6.
 */
@Data
public class Book {

    private Integer id;
    private String bookName;
    private String authorName;

}

