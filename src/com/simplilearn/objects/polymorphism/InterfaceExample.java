package com.simplilearn.objects.polymorphism;

// 100 % abstraction level
interface Drawable {
	 abstract void draw();
}

class Rectangle implements Drawable {

	public void draw() {
		System.out.println("Rectangle drawn");
	}
}

class Circle implements Drawable {
	
	public void draw() {
		System.out.println("Circle Drawn");
	}
}


public class InterfaceExample {

	public static void main(String[] args) {
		Drawable d = new Rectangle();
		d.draw();
		
		d = new Circle();
		d.draw();
	}

}
