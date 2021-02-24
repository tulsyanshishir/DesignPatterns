package com.learn.Prototype;

abstract class Shape {
	int x;
	int y;
	String color;
	
	Shape(){}

	Shape(Shape shape) {
		this();
		this.x = shape.x;
		this.y = shape.y;
		this.color = shape.color;
	}
	
	protected abstract Shape clone() ;
}

