package com.kshopov.dependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
