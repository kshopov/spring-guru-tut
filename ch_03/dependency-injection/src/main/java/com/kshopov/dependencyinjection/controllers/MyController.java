package com.kshopov.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String helloWolrd() {
        System.out.println("Hello world");

        return "Hi Folks";
    }

}
