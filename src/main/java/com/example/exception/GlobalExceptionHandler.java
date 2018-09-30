/*
package com.example.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

*/
/**
 * @author 王兴荣
 * @create 2018-07-26 13:30
 *  全局捕获异常
 **//*

@ControllerAdvice(basePackages = "com.example.controller")
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, Object>  errorResult(){
        //实际开发中要记录日志
        Map<String, Object> map = new HashMap<>();
        map.put("code","500");
        map.put("msg","系统异常");
        return map;
    }
}
*/
