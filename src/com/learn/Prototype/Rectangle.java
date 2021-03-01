package com.learn.Prototype;

public class Rectangle extends Shape{
	
	int width;
	int height;
	public Rectangle() {}
	//public Rectangle(Shape shape) {
	public Rectangle(Rectangle rect) {
		super(rect);
		this.width = rect.width;
		this.height = rect.height;
	}

	@Override
	protected Shape clone() {
		return new Rectangle(this);
	}

}
