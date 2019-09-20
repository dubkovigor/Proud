package com.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ProudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProudApplication.class, args);
    }
}
