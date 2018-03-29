package com.javaHut.service

import java.util.HashMap

import com.javaHut.dao.PizzaDao
import com.javaHut.model.Pizza

import spock.lang.Specification

class PizzaCompServiceSpec extends Specification {
	
	def "JavaHut will return menu with pizza prices"() {
	
	given: "A company"
	PizzaCompService JavaHut = new PizzaCompService();
	
	and: "A menu"
	Map<String, Double> pizzaMenu = new HashMap<String, Double>();
	Pizza peperoni = new Pizza("Pepperoni",12.00);
	Pizza sausage = new Pizza("Sausage",11.00);
	Pizza cheese = new Pizza("Cheese",10.00);
	pizzaMenu.put(peperoni.getPizzaName(), peperoni.getPrice());
	pizzaMenu.put(sausage.getPizzaName(), sausage.getPrice());
	pizzaMenu.put(cheese.getPizzaName(), cheese.getPrice());
	
	and: "A Pizza Dao"
	PizzaDao pizzaDao = Stub(PizzaDao.class)
	pizzaDao.getMenu() >> pizzaMenu
	
	JavaHut.pizza = pizzaDao
	
	when: "when customer request menu"
	String testMenu = JavaHut.getMenu();
	
	then: "JavaHut returns menu with prices"
	
	and: "Pizza Dao will return menu"
		testMenu == "Sausage : 11.0\nCheese : 10.0\nPepperoni : 12.0\n"
	}
}
