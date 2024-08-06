package com.tinqinacademy.admin.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.tinqinacademy.admin")
public class Main {
    public static void main(String[] args) {
        //run
        SpringApplication.run(Main.class, args);
    }
}