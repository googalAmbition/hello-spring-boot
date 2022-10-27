package com.tcoding.demo.quartz.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author 陈天成
 * @date 2022/10/26.
 */
@Data
public class MessageDto {
    private String content;
    private Long makeVisibleAt;
    private LocalDateTime created;
    private LocalDateTime modified;
    private String status;
}

