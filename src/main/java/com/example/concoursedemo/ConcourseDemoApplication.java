package com.example.concoursedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Conditional;
import org.springframework.lang.Contract;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class ConcourseDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConcourseDemoApplication.class, args);
    }
    @GetMapping
    public static boolean getStatus() {
        return true;
    }
}
