package com.learn.AbstractFactory;

public class DominosStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory factory = new DominosIngredientFactory();
		if(type == "Cheese") {
			pizza = new CheesePizza(factory) ;
			pizza.setName("Dominos Cheese Pizza");
			return pizza;
		}
		else if(type == "Veggie") {
			pizza = new VeggiePizza(factory);
			pizza.setName("Dominos Veggie Pizza");
			return pizza;
		}
		else
			return null;
	}

}
