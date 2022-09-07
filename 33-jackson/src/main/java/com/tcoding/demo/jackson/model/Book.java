package com.tcoding.demo.jackson.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author 陈天成
 * @date 2022/9/7.
 */
@Data
public class Book {

    private Long id;
    private String name;
    @JsonFormat(pattern = "yyyy-MM")
    private LocalDate publishDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
}

