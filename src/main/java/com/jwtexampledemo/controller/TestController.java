package com.jwtexampledemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class TestController {
    @GetMapping("/test")
    public String Test(){
        return "testing  Jdk 20  Run";
    }

    @GetMapping("/getUser")
    public String getUser(Principal principal){
        return principal.getName();
    }
}
