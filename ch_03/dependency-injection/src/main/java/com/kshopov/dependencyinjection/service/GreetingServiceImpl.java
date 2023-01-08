package com.kshopov.dependencyinjection.service;

public class GreetingServiceImpl implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
