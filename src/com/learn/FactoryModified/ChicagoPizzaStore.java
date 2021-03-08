package com.learn.FactoryModified;

public class ChicagoPizzaStore extends PizzaStore2 {

	@Override
	Pizza2 creatPizza(String type) {
		if(type=="Cheese")
			return new ChicagoCheesePizza();
		else if(type=="Veggie")
			return new ChicagoVeggeiPizza();
		else 
			return null;
	}

}
