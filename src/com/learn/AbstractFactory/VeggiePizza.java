package com.learn.AbstractFactory;

public class VeggiePizza extends Pizza {

	PizzaIngredientFactory factory;
	
	public VeggiePizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}
	@Override
	void prepare() {
		System.out.println("Preparing Pizza");
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();	
		veggeis = factory.createVeggies();
	}

}
