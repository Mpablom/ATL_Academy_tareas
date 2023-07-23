package com.example.bootampJava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/hacer-algo")
    public String primeraPrueba(){
        return "Hola Mundo!";
    }
    @GetMapping("/generar-password")
    public String generarPassword(){
        double aleatorio = Math.random() * 1000000;
        long numeroAleatorio = Math.round(aleatorio);

        String password = "asd"+numeroAleatorio;
        return password;
    }
}
