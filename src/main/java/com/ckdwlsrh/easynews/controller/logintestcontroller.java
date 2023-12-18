package com.ckdwlsrh.easynews.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class logintestcontroller {
    @GetMapping("/login")
    public String login(@RequestParam String id, @RequestParam String password) {
        return id;
    }
    
    @GetMapping("/")
    public String hello() {
        return "hello";
    }
    @GetMapping("/join")
    public String join() {
        return "hello";
    }
}
