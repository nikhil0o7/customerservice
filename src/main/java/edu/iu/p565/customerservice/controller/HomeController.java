package edu.iu.p565.customerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class HomeController {

    @GetMapping
    public String greetings(){
        return "Greetings!";
    }
    
}

// https://app.getpostman.com/join-team?invite_code=3a5b84dc5424873e3884a17bab51741d
