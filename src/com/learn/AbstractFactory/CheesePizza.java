package com.learn.AbstractFactory;

public class CheesePizza extends Pizza {
	
	PizzaIngredientFactory factory;
	
	public CheesePizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}

	@Override
	void prepare() {
		System.out.println("Preparing Pizza");
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
		veggeis =  factory.createVeggies();
	}

}
