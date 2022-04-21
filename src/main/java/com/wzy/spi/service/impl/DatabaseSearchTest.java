package com.wzy.spi.service.impl;

import com.wzy.spi.service.SearchTest;

/**
 * @author wzy
 * @date 2022/4/21 14:37
 */
public class DatabaseSearchTest implements SearchTest {
    @Override
    public void searchTest() {
        System.out.println("DatabaseSearchTest被注册到ioc容器中实例化");
    }
}
