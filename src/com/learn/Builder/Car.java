package com.learn.Builder;

public class Car {
 public int seats;
 public String engine;
 public Boolean GPS;
public int getSeats() {
	return seats;
}
public void setSeats(int seats) {
	this.seats = seats;
}
public String getEngine() {
	return engine;
}
@Override
public String toString() {
	return "Car [seats=" + seats + ", engine=" + engine + ", GPS=" + GPS + "]";
}
public void setEngine(String engine) {
	this.engine = engine;
}
public Boolean getGPS() {
	return GPS;
}
public void setGPS(Boolean gPS) {
	GPS = gPS;
}
}
