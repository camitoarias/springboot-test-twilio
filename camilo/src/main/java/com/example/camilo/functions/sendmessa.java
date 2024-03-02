package com.example.camilo.functions;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sendmessa {

    @RequestMapping( value = "/message")
    public String message1(){
        return "prueba de texto";
    }
}
