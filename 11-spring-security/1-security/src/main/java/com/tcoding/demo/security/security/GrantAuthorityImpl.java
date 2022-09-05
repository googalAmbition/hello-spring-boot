package com.tcoding.demo.security.security;

import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

/**
 * @author 陈天成
 * @date 2022/9/1.
 */
@AllArgsConstructor
public class GrantAuthorityImpl implements GrantedAuthority {

    private final String authority;

    @Override
    public String getAuthority() {
        return authority;
    }
}

