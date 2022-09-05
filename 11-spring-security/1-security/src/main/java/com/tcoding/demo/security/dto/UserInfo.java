package com.tcoding.demo.security.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author 陈天成
 * @date 2022/9/1.
 */
@Data
@AllArgsConstructor
public class UserInfo {

    private String name;
    private String password;
    private List<String> permission;
}

