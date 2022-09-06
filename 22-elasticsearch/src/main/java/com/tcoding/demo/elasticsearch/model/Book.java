package com.tcoding.demo.elasticsearch.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;

/**
 * @author 陈天成
 * @date 2022/9/6.
 */
@Data
@Document(indexName = "book1")
public class Book {

    @Id
    private Integer id;
    // @Field(type = FieldType.Text)
    private String bookName;
    // @Field(type = FieldType.Keyword)
    private String authorName;

    @Field(type = FieldType.Date, format = DateFormat.date_hour_minute_second)
    private LocalDateTime recordTime;
}

