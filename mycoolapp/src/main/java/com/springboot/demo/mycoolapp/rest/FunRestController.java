package com.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Worldddd!";
    }

//    @GetMapping("/workout")
//    public String getDailyWorkOut(){
//        return "Code more hardd";
//    }
}
