package com.learn.Builder;

public class CarBuilder implements Builder {
	
	private Car car;
	
	public CarBuilder() {
		this.reset();
	}

	@Override
	public void reset() {
		this.car = new Car();		
	}

	@Override
	public void setSeat(int seat) {
		this.car.setSeats(seat);
	}

	@Override
	public void setEngine(String engine) {
		this.car.setEngine(engine);
		
	}

	@Override
	public void setGPS(Boolean gps) {
		this.car.setGPS(gps);	
	}
	
	public Car getCar() {
		return this.car;
	}

}
