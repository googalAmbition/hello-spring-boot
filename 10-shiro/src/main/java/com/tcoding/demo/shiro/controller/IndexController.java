package com.tcoding.demo.shiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 陈天成
 * @date 2022/8/31.
 */
@Controller
@RequestMapping
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String toLogin(HttpServletRequest request) {
        return "login";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest request) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        // 添加用户认证信息
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(name, password);
        // 进行验证，这里可以捕获异常，然后返回对应信息
        SecurityUtils.getSubject().login(usernamePasswordToken);
        return "redirect:index";
    }

    @ResponseBody
    @RequiresPermissions("view")
    @GetMapping("/view")
    public String view() {
        return "view";
    }

    @ResponseBody
    @RequiresRoles("admin")
    @GetMapping("/edit")
    public String edit() {
        return "edit";
    }

    @ResponseBody
    @RequiresRoles("admin")
    @RequiresPermissions("del")
    @GetMapping("/del")
    public String del() {
        return "del";
    }

    @ResponseBody
    @GetMapping(value = "/error")
    public String error() {
        return "error page!";
    }
}

