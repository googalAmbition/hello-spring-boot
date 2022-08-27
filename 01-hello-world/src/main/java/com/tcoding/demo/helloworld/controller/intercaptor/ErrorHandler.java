package com.tcoding.demo.helloworld.controller.intercaptor;

import com.tcoding.demo.helloworld.controller.common.CommonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author tcoding
 * @date 2022/8/27.
 */
@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(Exception.class)
    public CommonResult<String> exceptionHandler(Exception e) {
        return CommonResult.failed(e.getMessage());
    }
}

