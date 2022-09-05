package com.tcoding.demo.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 陈天成
 * @date 2022/9/1.
 */
@Controller
@RequestMapping("/v1")
public class HelloController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/index")
    public String hello() {
        return "index";
    }

    // @GetMapping

    @ResponseBody
    @PreAuthorize("hasAuthority('view')")
    @GetMapping("/view")
    public String view() {
        return "view";
    }

    @ResponseBody
    @PreAuthorize("hasAuthority('edit')")
    @GetMapping("/edit")
    public String edit() {
        return "edit";
    }

    @ResponseBody
    @PreAuthorize("hasAuthority('del')")
    @GetMapping("/del")
    public String del() {
        return "del";
    }

    @ResponseBody
    @PreAuthorize("hasAuthority('view')")
    @GetMapping("/get")
    public String get() {
        return "view";
    }
}

