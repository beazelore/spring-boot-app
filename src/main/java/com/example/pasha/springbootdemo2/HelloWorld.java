package com.example.pasha.springbootdemo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorld {
    @RequestMapping("/")
    public static String helloworld(){
        return "HELLO WORLD!";
    }
}
