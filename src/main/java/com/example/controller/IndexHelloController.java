package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author 王兴荣
 * @create 2018-07-26 11:57
 **/
@Controller
@Slf4j
public class IndexHelloController {
    @RequestMapping("/")
    public String about(Map<String,Object> map) {
        map.put("appVersion","1.0.1");
        map.put("pwd","123456");
        System.out.println( "about-------------------------");
        log.info("about-------------------------");
        /*ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("appVersion","1.0.2");*/
        return "about";
    }

    @RequestMapping("/ftlIndex")
    public String ftlIndex(Map<String,Object> map) {
        map.put("user","wxr");
        map.put("pwd","123456");
        return "ftlIndex";
    }
}
