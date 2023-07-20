package com.example.bootampJava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/hacer-algo")
    public String primeraPrueba(){
        return "Hola Mundo!";
    }
}
