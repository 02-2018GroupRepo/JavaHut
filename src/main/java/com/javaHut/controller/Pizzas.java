package com.javaHut.controller;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.javaHut.service.PizzaCompService;
/*
 * This is the part of the application that handles the HTTP request
 * and the request for returning the instance of the menu class
 */
@RestController
public class Pizzas {
	PizzaCompService pizzaService = new PizzaCompService();
	
	public Pizzas(PizzaCompService pizzaService) {
		this.pizzaService = pizzaService;
	}
	
	@RequestMapping("/menu")
	public String Menu() {
		System.out.println(pizzaService.getMenu());
		return pizzaService.getMenu();
	}
}
