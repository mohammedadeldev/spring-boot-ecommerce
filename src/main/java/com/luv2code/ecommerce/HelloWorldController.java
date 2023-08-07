package com.luv2code.ecommerce;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}