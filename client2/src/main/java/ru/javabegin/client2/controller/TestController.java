package ru.javabegin.client2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new")
public class TestController {

    @Value("${tmpVar}")
    private int tmpVar;

    @GetMapping("/name")
    public String name(){

        return "временная переменная " + tmpVar;
    }
}
