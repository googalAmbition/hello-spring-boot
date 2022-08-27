package com.tcoding.demo.helloworld.controller.common;

/**
 * 封装API的错误码
 */
public interface IErrorCode {

    long getCode();

    String getMessage();
}
