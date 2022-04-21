package com.wzy.spi.service.impl;

import com.wzy.spi.service.Search;
import org.springframework.stereotype.Service;

/**
 * @author wzy
 * @date 2022/4/20 16:34
 */
@Service
public class FileSearch implements Search {
    @Override
    public String search() {
        System.out.println("file key:");
        return "file key:";
    }
}
