package com.wzy.spi.controller;

import com.demo.Print;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wzy
 * @date 2022/4/20 15:59
 */
@RequestMapping
@RestController
public class HelloController {

    @GetMapping("/hello")
    @Print
    public String hello(){
        return "Hello world";
    }
}
