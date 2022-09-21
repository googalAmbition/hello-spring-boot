package com.tcoding.demo.r2dbc.modle;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author 陈天成
 * @date 2022/9/20.
 */
@Data
@Table("book")
public class Book {

    @Id
    private Long id;

    private String name;
}

