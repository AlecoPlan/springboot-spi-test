package com.wzy.spi.controller;

import com.demo.Print;
import com.demo.service.impl.Search;
import com.wzy.spi.annotation.PrintTest;
import com.wzy.spi.service.SearchTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @Autowired
    private Search search;

    @Autowired
    private SearchTest searchTest;

    @GetMapping("/hello")
    @Print
    @PrintTest
    public String hello(){
        search.search();
        searchTest.searchTest();
        return "Hello world";
    }
}
