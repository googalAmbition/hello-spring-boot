package com.tcoding.demo.security.cas.service;

import com.tcoding.demo.security.cas.dto.UserInfo;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author 陈天成
 * @date 2022/9/1.
 */
@Service
public class UserService {

    private Map<String, UserInfo> name2user;

    {

    }
    // Map.of(
    // "admin", new UserInfo("admin", "123456", List.of("view", "edit", "add", "del")),
    // "test", new UserInfo("test", "123456", List.of("view"))
    //                                             );

    public UserInfo getUserByName(String name) {

        return name2user.get(name);
    }
}

