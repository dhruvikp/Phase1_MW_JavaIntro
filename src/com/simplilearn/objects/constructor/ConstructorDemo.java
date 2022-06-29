package com.simplilearn.objects.constructor;

//java.lang.Object


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
		//super(0);
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
		//EmpInfo empInfo = new EmpInfo();
		//EmpInfo empInfo2 = new EmpInfo(1,"Dhruvik");
		
		B b = new B();
	}

}
