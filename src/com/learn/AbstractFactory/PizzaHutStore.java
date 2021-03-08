package com.learn.AbstractFactory;

import java.util.List;

public class PizzaHutStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory factory = new PizzaHutIngredientFactory();
		if(type=="Cheese") {
			pizza = new CheesePizza(factory);
			pizza.setName("Pizza Hut Cheese Pizza");
			return pizza;
		}	
		else if(type=="Veggie") {
			pizza = new VeggiePizza(factory);
			pizza.setName("Pizza Hut Veggie Pizza");
			return pizza;
		}
		else
		 return null;
	}

}
