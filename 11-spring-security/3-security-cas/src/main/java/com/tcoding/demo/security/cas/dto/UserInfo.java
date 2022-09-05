package com.tcoding.demo.security.cas.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.Set;

/**
 * @author 陈天成
 * @date 2022/9/1.
 */
@Data
@NoArgsConstructor
public class UserInfo implements UserDetails {

    private String name;
    private String username;
    private String password;
    private List<String> permission;
    private Set<GrantedAuthority> authorities;
    private boolean isAccountNonExpired = true;

    private boolean isAccountNonLocked = true;

    private boolean isCredentialsNonExpired = true;

    private boolean isEnabled = true;
}

