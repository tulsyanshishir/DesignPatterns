package com.learn.FactoryModified;

public class NYCheesePizza extends Pizza2{
	
	@Override
	void prepare() {
	System.out.println("Prepare "+NYCheesePizza.class);
		
	}

	@Override
	void bake() {
		 System.out.println("Bake "+NYCheesePizza.class);
		
	}

	@Override
	void cut() {
		 System.out.println("Cut "+NYCheesePizza.class);
		
	}

	@Override
	void box() {
		System.out.println("Box "+NYCheesePizza.class);		
	}

}
