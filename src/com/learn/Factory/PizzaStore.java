package com.learn.Factory;

public class PizzaStore {
	
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;	
	}

	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore ps = new PizzaStore(factory);
		ps.orderPizza("Cheese");
		ps.orderPizza("Veggie");

	}

}
