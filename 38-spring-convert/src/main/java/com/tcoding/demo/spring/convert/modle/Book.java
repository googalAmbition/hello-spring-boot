package com.tcoding.demo.spring.convert.modle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 陈天成
 * @date 2022/9/20.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Long id;
    private String name;
}

