package by.htp.pizza.runner;

import by.htp.pizza.pizzaservice.Pizza;
import by.htp.pizza.pizzaservice.PizzaHouse;

public class MainApp {

	public static void main(String[] args) {
		
		
		Pizza pizza = new Pizza();
		pizza.size = 36;
		pizza.title = "4 season";
		
		Pizza pizza2 = new Pizza();
		pizza.size = 42;
		pizza.title = "Italy";


		PizzaHouse house = new PizzaHouse();
		Pizza pizza3 = house.cookPizza();
		
		System.out.println();
		
		//Ask for pizza
		
		// Cook pizza
		
		// Deliver pizza

	}

}
