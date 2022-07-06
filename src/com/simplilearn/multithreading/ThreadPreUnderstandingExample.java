package com.simplilearn.multithreading;


class A {
	
	void test() {
		System.out.println("test from A");
	}
}

class B {
	
	void test() {
		A a = new A();
		a.test();
	}
}

public class ThreadPreUnderstandingExample {

	public static void main(String[] args) {
		
		B b = new B();
		b.test();

	}

}
