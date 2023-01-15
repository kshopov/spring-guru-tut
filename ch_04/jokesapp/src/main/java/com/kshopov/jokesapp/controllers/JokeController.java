package com.kshopov.jokesapp.controllers;

import com.kshopov.jokesapp.service.JokeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class JokeController {

    private final JokeService jokeService;

    public JokeController(@Qualifier("jokeServiceBG") JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
