package com.learn.Builder;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Person person;

		CarBuilder cB = new CarBuilder();
		Director director = new Director();
		director.setBuilder(cB);
		director.createCar();
		Car car = cB.getCar();
		
		System.out.println(car);
		
		List<String> hobbies = new ArrayList<>();
		hobbies.add("Building");
		hobbies.add("Building more stuff");
		person = Person.builder()
					.name("Bob the builder")
					.age(7)
					.hobbies(hobbies)
					.build();
	 
		System.out.println(person);

	}

}
