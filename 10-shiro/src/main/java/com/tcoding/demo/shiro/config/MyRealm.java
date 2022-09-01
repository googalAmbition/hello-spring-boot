package com.tcoding.demo.shiro.config;

import com.tcoding.demo.shiro.model.User;
import com.tcoding.demo.shiro.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * @author 陈天成
 * @date 2022/8/31.
 */
@Component("authorizer")
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    /**
     * 用户授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String name = (String) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        Set<String> roles = userService.getRoleByName(name);
        simpleAuthorizationInfo.setRoles(roles);
        List<String> permissions = userService.getPermissionByName(name);
        simpleAuthorizationInfo.addStringPermissions(permissions);
        return simpleAuthorizationInfo;
    }

    /**
     * 用户认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        // 加这一步的目的是在请求的时候会先进认证，然后在到请求
        if (authenticationToken.getPrincipal() == null) {
            return null;
        }
        String name = authenticationToken.getPrincipal().toString();
        User user = userService.getUserByName(name);
        if (user == null) {
            return null;
        }
        return new SimpleAuthenticationInfo(user.getName(), user.getPassword(), getName());
    }
}

