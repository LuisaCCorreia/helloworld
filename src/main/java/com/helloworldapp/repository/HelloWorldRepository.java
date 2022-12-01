package com.helloworldapp.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldRepository {

    /**
     * @return Método que retorna string Hello World.
     */
    public String showHelloWorld() {
        return "Hello World";
    }
}
