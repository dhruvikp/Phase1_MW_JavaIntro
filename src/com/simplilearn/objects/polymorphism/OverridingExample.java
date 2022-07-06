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


// Vehicle v = new Bike();


abstract class Food {
	void test() {
		System.out.println("tests");
	}
	abstract void eat() ;
}

class Burger extends Food {

	@Override
	void eat() {
		
	}
}



public class OverridingExample {

	public static void main(String[] args) {
		
		Food food = new Burger();
		food.eat();
		
		
		Bike b = new Bike();
		b.run();
		
		Vehicle v = new Vehicle();
		v.run();
		
		Vehicle v1 = new Bike();
		v1.run();
	}
}
