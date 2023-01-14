package com.kshopov.dependencyinjection.controllers;

import com.kshopov.dependencyinjection.service.GreetingsService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingsService greetingsService;

    public MyController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String helloWolrd() {
        return greetingsService.sayGreeting();
    }

}
