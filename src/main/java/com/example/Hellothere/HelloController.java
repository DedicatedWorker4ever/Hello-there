package com.example.Hellothere;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        System.out.println("hello there!");

        return "Greetings from Spring Boot! And Sam";

    }

}
