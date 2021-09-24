package com.example.hellospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/first-mapping")
    public String firstMapping(){
        return "<b>Hello World<b>";
    }
}
