package com.helloworldapp.controller;

import com.helloworldapp.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
	/**
	 * Service do Hello World.
	 * */
	private final HelloWorldService service;

	/**
	 * @param helloWorldService Atribui service do Hello World.
	 * */
	public HelloWorldController(final HelloWorldService helloWorldService) {
		this.service = helloWorldService;
	}

	/**
	 * @return  Mostra a mensagem Hello World, por meio da service.
	 * */
	@GetMapping("/helloworld")
	public String showHelloWorld() {
		return service.showHelloWorld();
	}
}
