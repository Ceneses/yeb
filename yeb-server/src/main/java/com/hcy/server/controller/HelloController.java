package com.hcy.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName HelloController
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2021/3/11 15:55
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest httpServletRequest) {
        httpServletRequest.getSession().setAttribute("text","HCY");
        return "hello";
    }

    @GetMapping("/test")
    public String test(HttpServletRequest httpServletRequest) {
        System.out.println(httpServletRequest.getSession().getAttribute("captcha"));
        return "test1";
    }
}
