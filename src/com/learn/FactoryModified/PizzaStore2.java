package com.learn.FactoryModified;

public abstract class PizzaStore2 {
	
	public Pizza2 orderPizza(String type) {
		Pizza2  pizza;
		pizza = creatPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;	
	}
	abstract Pizza2 creatPizza(String type);

}
