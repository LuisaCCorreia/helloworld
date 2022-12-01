package com.helloworldapp.service;

import com.helloworldapp.repository.HelloWorldRepository;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    /**
     * Repository do Hello World.
     * */
    private final HelloWorldRepository repository;

    /**
     * @param helloWorldRepository
     * */
    public HelloWorldService(final HelloWorldRepository helloWorldRepository) {
        this.repository = helloWorldRepository;
    }

    /**
     * @return Retorna a string recebida do repository.
     * */
    public String showHelloWorld() {
        return repository.showHelloWorld();
    }
}
