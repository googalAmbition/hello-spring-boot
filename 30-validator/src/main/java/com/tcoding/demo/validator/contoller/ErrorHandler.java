package com.tcoding.demo.validator.contoller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.ConstraintViolationException;

/**
 * @author 陈天成
 * @date 2021/6/9.
 */
@Slf4j
@RestControllerAdvice
public class ErrorHandler {

    /**
     * 参数效验异常处理器
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> parameterExceptionHandler(MethodArgumentNotValidException e) {
        // 获取异常信息
        BindingResult exceptions = e.getBindingResult();
        // 判断异常中是否有错误信息，如果存在就使用异常中的消息，否则使用默认消息
        if (exceptions.hasErrors()) {
            List<FieldError> errors = exceptions.getFieldErrors();
            if (!errors.isEmpty()) {
                // 这里列出了全部错误参数，按正常逻辑，只需要第一条错误即可
                Map<String, String> errorMsg = new HashMap<>();
                for (FieldError error: errors) {
                    errorMsg.put(error.getField(), error.getDefaultMessage());
                }
                return errorMsg;
            }
        }
        return Map.of();
    }

    @ExceptionHandler({ConstraintViolationException.class, MissingServletRequestParameterException.class})
    public String paramException(Exception e) {
        return e.getMessage();
    }
}

