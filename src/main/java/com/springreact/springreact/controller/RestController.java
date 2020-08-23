package com.springreact.springreact.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/welcomestring")
    public String welcomeStringOnly(){
        return "index.html";
    }

}
