package com.learn.Builder;

public class Director {
	private Builder builder;
		
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public void createCar() {
		builder.reset();
		builder.setEngine("Turbo");
		builder.setGPS(true);
		builder.setSeat(4);	
	}

}
