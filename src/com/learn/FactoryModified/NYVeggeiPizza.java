package com.learn.FactoryModified;

public class NYVeggeiPizza extends Pizza2 {

	@Override
	void prepare() {
	System.out.println("Prepare "+NYVeggeiPizza.class);
		
	}

	@Override
	void bake() {
		 System.out.println("Bake "+NYVeggeiPizza.class);
		
	}

	@Override
	void cut() {
		 System.out.println("Cut "+NYVeggeiPizza.class);
		
	}

	@Override
	void box() {
		System.out.println("Box "+NYVeggeiPizza.class);		
	}
}
