package com.tcoding.demo.aop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 陈天成
 * @date 2022/9/7.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Integer id;

    private String name;

    private String author;

    private String category;

    public interface Save { }

    public interface Update { }
}


