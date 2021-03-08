package com.learn.AbstractFactory;

import java.util.List;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public List<Veggies> createVeggies();
	
}
 