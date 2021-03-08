package com.learn.Factory;

public class VeggeiPizza extends Pizza{


	@Override
	void prepare() {
	System.out.println("Prepare"+VeggeiPizza.class);
		
	}

	@Override
	void bake() {
		 System.out.println("Bake"+VeggeiPizza.class);
		
	}

	@Override
	void cut() {
		 System.out.println("Cut"+VeggeiPizza.class);
		
	}

	@Override
	void box() {
		System.out.println("Box"+VeggeiPizza.class);		
	}

}
