package com.learn.Builder;

import java.util.List;

public class Person {
	
	String name;
	int age;
    double salary;
    List<String> hobbies;
    
    Person(String name, int age, double salary,List<String> hobbies){
    	this.name = name;
    	this.age = age;
    	this.salary = salary;
    	this.hobbies = hobbies;
    }
    
    public static PersonBuilder builder() {
    	return new PersonBuilder();
    }

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + ", hobbies=" + hobbies + "]";
	}
    
    
}
