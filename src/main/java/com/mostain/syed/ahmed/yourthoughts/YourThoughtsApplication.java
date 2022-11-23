package com.mostain.syed.ahmed.yourthoughts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class YourThoughtsApplication {

    public static void main(String[] args) {
        SpringApplication.run(YourThoughtsApplication.class, args);
    }

}
