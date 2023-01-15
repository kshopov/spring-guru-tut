package com.kshopov.jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class JokeController {

    @GetMapping
    public String getJoke(Model model) {
        return "index";
    }
}
