package com.javaHut.model;
/* 
 * This is the model for the pizza class
 */

public class Pizza {
	
	private String pizzaName ;
	private double price;
	
	// Constructor
	public Pizza() {}
	
	public Pizza(String pizzaName,double price) {
		this.pizzaName = pizzaName;
		this.price = price;
	}
	
	//Getters
	public double getPrice() {
		return price;
	}
	
	public String getPizzaName() {
		return pizzaName;
	}
}
