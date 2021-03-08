package com.learn.AbstractFactory;

public class OrderPizza {
	
	public static void main(String args[]) {
		PizzaStore dominos = new DominosStore();
		PizzaStore pizzaHut = new PizzaHutStore();
		Pizza pizza = dominos.orderPizza("Cheese");
		System.out.println(pizza);
		pizza = pizzaHut.orderPizza("Veggie");
		System.out.println(pizza);
	}


}
