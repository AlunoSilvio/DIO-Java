package com.controller;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {

    @GetMapping
    public String getMethodName() {
        return "main page";
    }
    
}
