package com.wzy.spi;

import com.wzy.spi.service.impl.DatabaseSearch;
import com.wzy.spi.service.impl.FileSearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class SpringbootSpiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSpiTestApplication.class, args);
    }

}
