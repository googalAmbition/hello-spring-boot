package com.tcoding.demo.helloworld.controller;

import com.tcoding.demo.helloworld.controller.api.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈天成
 * @date 2022/8/27.
 */
@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/get")
    public CommonResult<String> get() {
        return CommonResult.success("hello world");
    }

    @GetMapping("/exception")
    public CommonResult<String> exception() {
        int a = 1 / 0;
        return CommonResult.success("exception");
    }
}

