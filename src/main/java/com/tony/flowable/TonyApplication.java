package com.tony.flowable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class TonyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TonyApplication.class, args);
    }


}
