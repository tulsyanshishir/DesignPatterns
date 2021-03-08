package com.learn.AbstractFactory;

import java.util.Arrays;
import java.util.List;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	List<Veggies> veggeis;
	
	abstract void prepare();
	
    public void bake(){
    	System.out.println("Baking at 350\"");
    }
    
    public void cut(){
    	System.out.println("Cutting your pizza");
    }
		
    public void box() {
    	System.out.println("Ready for delivery");
    }
    
    
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", cheese=" + cheese + ", veggeis="
				+ veggeis + "]";
	}

	
    
    
}
