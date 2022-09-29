package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class HelloController {
    @GetMapping
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>("Hello Springboot!!", OK);
    }
}
