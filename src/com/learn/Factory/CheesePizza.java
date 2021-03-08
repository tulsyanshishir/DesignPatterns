package com.learn.Factory;

public class CheesePizza extends Pizza{

	@Override
	void prepare() {
	System.out.println("Prepare"+CheesePizza.class);
		
	}

	@Override
	void bake() {
		 System.out.println("Bake"+CheesePizza.class);
		
	}

	@Override
	void cut() {
		 System.out.println("Cut"+CheesePizza.class);
		
	}

	@Override
	void box() {
		System.out.println("Box"+CheesePizza.class);		
	}

}
