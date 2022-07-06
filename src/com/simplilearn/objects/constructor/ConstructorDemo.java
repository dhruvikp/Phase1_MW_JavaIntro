package com.simplilearn.objects.constructor;

import java.awt.Color;

//java.lang.Object

// You want to initialize properties when you create object
// If you do not define any constructor then your compiler will generate NO-ARG constructor automatically


class Pen {
	String color;
	int point;

	Pen() {
		super();
		System.out.println("Pen Parent class No-Arg constructor invoked");
		color = "blue";
	}
	
	Pen(String color) {
		this.color = color;
	}

	void write() {
		System.out.println("writing using color " + color);
	}
}

class ParkerPen extends Pen {
	
	public ParkerPen() {
		super();
		System.out.println("ParketPen No-Arg Constructor invoked");
		this.color="black";
	}
}

class A {
	public A() {
		super();
		System.out.println("This is from constructor A");
	}

	public A(int a) {

	}
}

class B extends A {
	public B() {
		// super(0);
		System.out.println("This is from Constructor B");
	}
}

class EmpInfo {
	private int id;
	private String name;

	// NO -ARG Constructor
	EmpInfo() {
		System.out.println("Constructor is invoked");
	}

	// Parameterized Constructor
	EmpInfo(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Parameterised Constructor is invoked");
	}

}

public class ConstructorDemo {

	public static void main(String[] args) {
		// EmpInfo empInfo = new EmpInfo();
		// EmpInfo empInfo2 = new EmpInfo(1,"Dhruvik");

		B b = new B();

		Pen pen = new Pen();
		pen.write();
		
		Pen pen1 = new Pen("Red");
		pen1.write();
	
	System.out.println("--------------------");
		ParkerPen pp = new ParkerPen();
		pp.write();
	
	}
	

}
