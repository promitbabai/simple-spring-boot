package com.example.promit.test.springbootsimpletest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloController {


    /**
     *
     * @return - Return Value
     */
    @GetMapping("/hello")
    public String hello(){
               return "Hello Promit";
    }
}
