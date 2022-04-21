package com.wzy.spi.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wzy
 * @date 2022/4/20 17:31
 */
@Configuration
public class PrintTestConfiguration {

    @Bean
    public PrintTestProcess printTestProcess() {
        return new PrintTestProcess();
    }
}