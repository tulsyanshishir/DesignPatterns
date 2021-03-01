package com.learn.Builder;

import java.util.ArrayList;
import java.util.List;

public class PersonBuilder {

	String name;
	int age;
    double salary;
    List<String> hobbies;
    
    PersonBuilder(){}
    
    public PersonBuilder name(String name) {
    	this.name = name;
    	return this;
    }
    
    public PersonBuilder age(int age) {
		this.age = age;
		return this;
	}
    
    public PersonBuilder salary(double salary) {
		this.salary = salary;
		return this;
	}
    
    public PersonBuilder hobbies(String hobby) {
    	if(this.hobbies == null) 
    		this.hobbies = new ArrayList<String>();
    	
    	this.hobbies.add(hobby);
    	return this;
    }
    
    public PersonBuilder hobbies(List<? extends String> hobbies) {
    	if(this.hobbies == null) 
    		this.hobbies = new ArrayList<String>();
    	
    	this.hobbies.addAll(hobbies);
    	return this;
    }
    
    public PersonBuilder clearHobbies() {
    	if(this.hobbies != null) 
    		this.hobbies.clear();
    	return this;
    }

    public Person build() {
    	return new Person(name, age, salary, hobbies);
    }
}
