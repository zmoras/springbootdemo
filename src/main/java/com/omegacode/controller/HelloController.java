package com.omegacode.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kma
 * 19.12.2016
 */
//@RestController
public class HelloController {
 
    @RequestMapping("/")
    public String index() {
        return "springdemo: work in progress!";
    }
 
}

