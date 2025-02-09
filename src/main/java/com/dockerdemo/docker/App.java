package com.dockerdemo.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.out.println("Docker Demo!");
        ApplicationContext applicationContext=SpringApplication.run(App.class, args);
    }
}
