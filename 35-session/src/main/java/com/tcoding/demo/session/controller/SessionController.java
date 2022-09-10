package com.tcoding.demo.session.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author 陈天成
 * @date 2022/9/11.
 */
@RestController
public class SessionController {

    @GetMapping("/set")
    public String session(HttpSession session) {
        session.setAttribute("tcoding", "session demo");
        return "success";
    }

    @GetMapping("/get")
    public String get(HttpSession session) {
        return (String) session.getAttribute("tcoding");
    }
}

