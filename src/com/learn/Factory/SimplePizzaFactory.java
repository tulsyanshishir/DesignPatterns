package com.learn.Factory;

public class SimplePizzaFactory{
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type=="Cheese")
			pizza = new CheesePizza();
		else if(type == "Veggie")
			pizza = new VeggeiPizza();
		return pizza;
	}

}
