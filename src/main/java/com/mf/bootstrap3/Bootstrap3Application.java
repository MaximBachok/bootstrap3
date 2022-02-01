package com.mf.bootstrap3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = { SecurityAutoConfiguration.class })
public class Bootstrap3Application {

    public static void main(String[] args) {
        SpringApplication.run(Bootstrap3Application.class, args);
    }

}
