package com.example.demo.web;

import com.example.demo.model.DemoClass;
import com.example.demo.service.GreetingsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    private final GreetingsService greetingsService;

    public FirstController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    @GetMapping(path = "/{specialId}")
    public DemoClass index(@PathVariable("specialId") long id,
                           @RequestParam(name = "firstName", required = false, defaultValue = "I'm a default") String name) {
        return greetingsService.getGreetingsMessage(id, name);
    }
}
