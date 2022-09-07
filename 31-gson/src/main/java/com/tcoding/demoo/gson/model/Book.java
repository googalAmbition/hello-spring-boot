package com.tcoding.demoo.gson.model;

import com.google.gson.annotations.JsonAdapter;
import com.tcoding.demoo.gson.config.GsonConfig;
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
    @JsonAdapter(value = GsonConfig.LocalDateAdapter.class)
    private LocalDate publishDate;
    @JsonAdapter(value = GsonConfig.LocalDateTimeAdapter.class)
    private LocalDateTime createTime;
}

