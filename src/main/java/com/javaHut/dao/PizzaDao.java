package com.javaHut.dao;
import java.util.HashMap;
import java.util.Map;

import com.javaHut.model.Pizza;
/*
 * This is the PizzaDao that hold the items in the Menu
*/
public class PizzaDao {
	
	Map<String, Double> pizzaMenu; 
	Pizza peperoni = new Pizza("Pepperoni",12.00);
	Pizza sausage = new Pizza("Sausage",11.00);
	Pizza cheese = new Pizza("Cheese",10.00);

	// This is instantiating a new HashMap 
	public PizzaDao() {
		pizzaMenu  = new HashMap<>();
		
	}
	
	// This is adding the pizza name and prices to the HashMap
	public  Map<String,Double> getMenu() {
		pizzaMenu.put(peperoni.getPizzaName(), peperoni.getPrice());
		pizzaMenu.put(sausage.getPizzaName(), sausage.getPrice());
		pizzaMenu.put(cheese.getPizzaName(), cheese.getPrice());
		return pizzaMenu;	
	}

}
