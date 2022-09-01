package com.tcoding.demo.shiro.service;

import com.tcoding.demo.shiro.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author 陈天成
 * @date 2022/8/31.
 */
@Service
public class UserService {

    private Map<String, User> userMap = List.of(new User("admin", "123456"), new User("test", "1234")).stream()
        .collect(Collectors.toMap(User::getName, x -> x));

    private Map<String, List<String>> name2permission =
        Map.of("admin", List.of("view", "edit", "add", "del"), "test", List.of("view"));

    private Map<String, Set<String>> name2role =
        Map.of("admin", Set.of("admin"), "test", Set.of("employee"));

    public User getUserByName(String name) {
        return userMap.get(name);
    }

    public List<String> getPermissionByName(String name) {
        return name2permission.get(name);
    }

    public Set<String> getRoleByName(String name) {
        return name2role.get(name);
    }
}

