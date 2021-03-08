package com.learn.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class PizzaHutIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new ChillySauce();
	}

	@Override
	public Cheese createCheese() {
		return new ProcessedCheese();
	}

	@Override
	public List<Veggies> createVeggies() {
		List<Veggies> veggies = new ArrayList<>();
		veggies.add(new Capsicum());
		veggies.add(new Spinach());
		return veggies;
	}

}
