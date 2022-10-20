package com.tcoding.demo.filter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
@RestController
public class Controller {

    @GetMapping("/ann")
    public String ann() {
        return "ann";
    }

    @GetMapping("/bean")
    public String bean() {
        return "bean";
    }

    @GetMapping("/all")
    public String all() {
        return "all";
    }
}

