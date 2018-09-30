package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王兴荣
 * @create 2018-07-26 11:26
 **/

@RestController//@RestController=@controller+@ResponseBody(返回json )用RestController不能出现视图页面
@Slf4j
public class IndexController {


    @RequestMapping("/index")
    @Transactional
    public String index() {
        return "启动成功!!!!!!";
    }


    @RequestMapping("/hello")
    public String hello(Integer j) {
        log.info("RestController内的log");
        int i=1/j;
        return "hello you213";
    }


}
