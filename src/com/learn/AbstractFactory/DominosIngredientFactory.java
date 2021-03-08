package com.learn.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class DominosIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new CheeseBurstDough();
	}

	@Override
	public Sauce createSauce() {
		return new SchezwanSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public List<Veggies> createVeggies() {
		List<Veggies> veggies = new ArrayList<>();
		veggies.add(new Onion());
		veggies.add(new Paneer());
		return veggies;
	}

}
