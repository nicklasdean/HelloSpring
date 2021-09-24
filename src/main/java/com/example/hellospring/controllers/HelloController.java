package com.example.hellospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/first-mapping")
    public String firstMapping(){
        return "<b>Hello World<b>";
    }

    @GetMapping("/second-mapping")
    public String secondMapping(){
        return "This is the second mapping";
    }

    @GetMapping("/")
    public String index(){
        return "Welcome to my Spring Application";
    }

    @GetMapping("/parameter")
    public String parameter(@RequestParam String input){
        //For this to work:
        //localhost:8080/parameter?input=HelloWorld
        return input + " " + "end of string";
    }
}
