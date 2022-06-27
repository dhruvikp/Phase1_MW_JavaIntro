package com.simplilearn.objects.polymorphism;


class Vehicle {
	public void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle {
	public void run() {
		System.out.println("Bike is running");
	}
}

public class OverridingExample {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.run();
		
		Vehicle v = new Vehicle();
		v.run();
		
		Vehicle v1 = new Bike();
		v1.run();
	}
}
