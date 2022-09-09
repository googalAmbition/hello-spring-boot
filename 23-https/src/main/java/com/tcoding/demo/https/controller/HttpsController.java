package com.tcoding.demo.https.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈天成
 * @date 2022/9/9.
 */
@RestController
public class HttpsController {

    @RequestMapping("/")
    public String https() {
        return "success";
    }
}

