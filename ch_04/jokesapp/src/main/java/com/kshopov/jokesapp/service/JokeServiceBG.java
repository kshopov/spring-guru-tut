package com.kshopov.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceBG implements JokeService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceBG(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return "from bg" + chuckNorrisQuotes.getRandomQuote();
    }

}
