package com.example.jktest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class index {
    @GetMapping("/")
    public @ResponseBody String index() {
        return "Hello";
    }
    
}
