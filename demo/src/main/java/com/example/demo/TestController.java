package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test(@RequestParam(value = "name", defaultValue = "World") String name) {
		//test123
		//feature2에서 작업
        return String.format("Test  %s!",name);
    }
}