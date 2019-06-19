package com.neo.runtest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Component
public class TestRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("Test Runner");
    }
}
