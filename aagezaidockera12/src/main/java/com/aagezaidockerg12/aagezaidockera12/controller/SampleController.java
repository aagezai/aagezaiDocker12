package com.aagezaidockerg12.aagezaidockera12.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleController {
    @GetMapping
    public String inSideDocker(){

        return "We are inside to Docker ";
    }
    @GetMapping("/api")
    public String welcomeToDocker(){
        return "welcome to Docker ";
    }
}
