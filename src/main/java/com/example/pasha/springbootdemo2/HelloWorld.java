package com.example.pasha.springbootdemo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {
    @RequestMapping("/")
    public static String helloworld(){
        return "HELLO WORLD!";
    }
}
