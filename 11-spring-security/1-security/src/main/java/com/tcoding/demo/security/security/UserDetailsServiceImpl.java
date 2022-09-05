package com.tcoding.demo.security.security;

import com.tcoding.demo.security.dto.UserInfo;
import com.tcoding.demo.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 陈天成
 * @date 2022/9/1.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo user = userService.getUserByName(username);
        if (user == null) {
            throw new UsernameNotFoundException("user not found");
        }
        List<GrantAuthorityImpl> authorities = user.getPermission().stream().map(GrantAuthorityImpl::new).collect(Collectors.toList());
        return new User(username, user.getPassword(), authorities);
    }
}

