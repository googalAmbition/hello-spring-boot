package com.tcoding.demo.hateoas.modle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

/**
 * @author 陈天成
 * @date 2022/9/10.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book extends RepresentationModel<Book> {

    private Long id;
    private String bookName;
    private String authorName;
}

