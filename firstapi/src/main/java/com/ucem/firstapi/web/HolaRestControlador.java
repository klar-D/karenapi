package com.ucem.firstapi.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludorest")
public class HolaRestControlador {

    @GetMapping("/hola")
    public String hola() {
        return "Hola";
    }
}
