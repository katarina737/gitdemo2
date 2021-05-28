package com.toki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class helloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("sssss");
        System.out.println("hot!");
        return String.format("Hello %s!", name);
    }
}
