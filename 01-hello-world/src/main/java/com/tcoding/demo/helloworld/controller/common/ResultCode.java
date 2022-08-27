package com.tcoding.demo.helloworld.controller.common;

import lombok.AllArgsConstructor;

/**
 * @author tc
 */

@AllArgsConstructor
public enum ResultCode implements IErrorCode {
    /**
     * 错误信息封装
     */
    SUCCESS(0, "操作成功"),
    FAILED(1, "操作失败"),
    VALIDATE_FAILED(2, "参数检验失败"),
    UNAUTHORIZED(3, "暂未登录或token已经过期"),
    FORBIDDEN(4, "没有相关权限");

    private final long code;
    private final String message;

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
