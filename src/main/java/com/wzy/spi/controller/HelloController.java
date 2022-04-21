package com.wzy.spi.controller;

import com.demo.Print;
import com.wzy.spi.service.Search;
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

    private Search search;

    @GetMapping("/hello")
    @Print
    public String hello(){
//        this.search.search();
        return "Hello world";
    }
}
