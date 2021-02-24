package com.learn.Prototype;

import java.util.*;

public class MakePrototype {

	public static void main(String[] args) {
		
		List<Shape> shapes = new ArrayList<>();
		
		Rectangle r1 = new Rectangle();
		r1.width =  r1.x = 10;
		r1.height = r1.y = 20;		
		shapes.add(r1);
		
		Rectangle r2 = (Rectangle) r1.clone();
		System.out.println("R1 width= "+r1.width+" "+"R2 width= "+r2.width);
		shapes.add(r2);
		
		System.out.println(r1.equals(r2));
		
		Circle c1 = new Circle();
		c1.radius = 10;
		c1.x = 10;
		c1.y = 10;
		shapes.add(c1);
		
		Circle c2 = (Circle) c1.clone();
		shapes.add(c2);
		
		
	}
}
