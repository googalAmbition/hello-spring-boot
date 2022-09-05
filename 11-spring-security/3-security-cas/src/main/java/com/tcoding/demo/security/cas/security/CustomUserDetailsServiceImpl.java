package com.tcoding.demo.security.cas.security;

import com.tcoding.demo.security.cas.dto.UserInfo;
import org.springframework.security.cas.authentication.CasAssertionAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 陈天成
 * @date 2022/9/2.
 */
@Service
public class CustomUserDetailsServiceImpl implements AuthenticationUserDetailsService<CasAssertionAuthenticationToken> {

    @Override
    public UserDetails loadUserDetails(CasAssertionAuthenticationToken token) throws UsernameNotFoundException {
        System.out.println("当前的用户名是：" + token.getName());
        /*这里我为了方便，就直接返回一个用户信息，实际当中这里修改为查询数据库或者调用服务什么的来获取用户信息*/
        UserInfo userInfo = new UserInfo();
        userInfo.setName("admin");
        Set<GrantedAuthority> authorities = new HashSet<>();
        GrantedAuthority authorityInfo = new GrantAuthorityImpl("TEST");
        authorities.add(authorityInfo);
        userInfo.setAuthorities(authorities);
        return userInfo;
    }
}

