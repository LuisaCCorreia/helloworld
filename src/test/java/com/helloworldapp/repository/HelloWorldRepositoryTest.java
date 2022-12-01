package com.helloworldapp.repository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Teste Unitário do repository.
 **/

class HelloWorldRepositoryTest {

    @Test
    public void TesteHelloWorldRepository() {
        HelloWorldRepository repo = new HelloWorldRepository();
        String resposta = repo.showHelloWorld();
        assertEquals("Hello World", resposta);
    }

}