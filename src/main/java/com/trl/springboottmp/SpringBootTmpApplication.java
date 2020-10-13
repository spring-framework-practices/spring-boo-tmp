package com.trl.springboottmp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTmpApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootTmpApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTmpApplication.class, args);

    }

}
