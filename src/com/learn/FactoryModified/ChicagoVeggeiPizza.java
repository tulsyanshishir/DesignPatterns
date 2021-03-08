package com.learn.FactoryModified;

public class ChicagoVeggeiPizza extends Pizza2 {

	@Override
	void prepare() {
	System.out.println("Prepare "+ChicagoVeggeiPizza.class);
		
	}

	@Override
	void bake() {
		 System.out.println("Bake "+ChicagoVeggeiPizza.class);
		
	}

	@Override
	void cut() {
		 System.out.println("Cut "+ChicagoVeggeiPizza.class);
		
	}

	@Override
	void box() {
		System.out.println("Box "+ChicagoVeggeiPizza.class);		
	}
}
