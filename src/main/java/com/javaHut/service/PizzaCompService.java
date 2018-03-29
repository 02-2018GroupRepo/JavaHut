package com.javaHut.service;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;

import com.javaHut.dao.PizzaDao;
//import com.javaHut.Dao.PizzaDao;
import com.javaHut.model.Pizza;

/*
 * This is the pizza company service class that is used to 
 * get getMenu function from the pizzaDao class
 */
@Component
public class PizzaCompService {

	PizzaDao pizza;
	
	// Constructor to establish a new PizzaDao
	public PizzaCompService() {
		this.pizza = new PizzaDao();
	}
     
	// This is the method that returns the String for the Menu
	public String getMenu() {
		String pizzamenu = "";
		for(Map.Entry<String, Double> entry: pizza.getMenu().entrySet()) {
			pizzamenu+= entry.getKey() + " : "+ entry.getValue() + "\n";
		}
		return pizzamenu;
	}
}
