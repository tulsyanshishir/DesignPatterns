package com.learn.Prototype;

public class Rectangle extends Shape{
	
	int width;
	int height;
	public Rectangle() {}
	public Rectangle(Shape shape) {
		super(shape);
		this.width = shape.x;
		this.height = shape.y;
	}

	@Override
	protected Shape clone() {
		return new Rectangle(this);
	}

}
