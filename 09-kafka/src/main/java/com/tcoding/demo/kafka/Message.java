package com.tcoding.demo.kafka;

import java.time.LocalDateTime;

/**
 * @author 陈天成
 * @date 2022/8/31.
 */
public class Message {
    private Long id;
    private String name;
    private LocalDateTime dateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}

