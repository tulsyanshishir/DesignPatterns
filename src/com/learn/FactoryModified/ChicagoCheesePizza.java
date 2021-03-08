package com.learn.FactoryModified;

public class ChicagoCheesePizza extends Pizza2 {

	@Override
	void prepare() {
	System.out.println("Prepare "+ChicagoCheesePizza.class);
		
	}

	@Override
	void bake() {
		 System.out.println("Bake "+ChicagoCheesePizza.class);
		
	}

	@Override
	void cut() {
		 System.out.println("Cut "+ChicagoCheesePizza.class);
		
	}

	@Override
	void box() {
		System.out.println("Box "+ChicagoCheesePizza.class);		
	}
}
