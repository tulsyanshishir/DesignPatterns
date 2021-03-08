package com.learn.FactoryModified;

public class NYPizzaStore extends PizzaStore2 {
	
	@Override
	Pizza2 creatPizza(String type) {
		if(type=="Cheese")
			return new NYCheesePizza();
		else if(type=="Veggie")
			return new NYVeggeiPizza();
		else 
			return null;
	}

}
