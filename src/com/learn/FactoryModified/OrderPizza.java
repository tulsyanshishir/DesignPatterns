package com.learn.FactoryModified;

public class OrderPizza {
	public static void main(String args[]) {
		PizzaStore2 NYStore = new NYPizzaStore();
		PizzaStore2 ChStore = new ChicagoPizzaStore();
		Pizza2 pizza = NYStore.orderPizza("Cheese");
		pizza = ChStore.orderPizza("Veggie");
	}
}
