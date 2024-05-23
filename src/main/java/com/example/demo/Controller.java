package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("Hola")
    public String getHola(){
        return "<h1>Hola mundo!!</h1>";
    }
}
