package com.learn.Prototype;

public class Circle extends Shape {
	int radius;
	public Circle() {}
	public Circle(Shape shape){
		super(shape);
		this.radius = shape.x;
	}
	
	@Override
	protected Shape clone() {
		return new Circle(this);
	}
	
}
