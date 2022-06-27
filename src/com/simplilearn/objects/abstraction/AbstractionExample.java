package com.simplilearn.objects.abstraction;

// Incomplete class 0 to 100% abstraction level
abstract class Vehicle {
	
	public void engine() {
		System.out.println("Engine is defined");
	}
	
	public abstract void drive();
	
}

class Bike extends Vehicle {
	
	public void drive() {
		System.out.println("Bike is running");
	}
}


public class AbstractionExample {

	public static void main(String[] args) {
		
		Vehicle v = new Bike();
		v.drive();
	}
}
