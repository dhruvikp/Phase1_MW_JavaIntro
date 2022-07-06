package com.simplilearn.innerclass;

public class StaticNestedClassExample {

	static int data = 30;

	static class Inner {
		void msg() {
			System.out.println("Data is :" + data);
		}
	}

	public static void main(String[] args) {
		StaticNestedClassExample.Inner innerObj = new StaticNestedClassExample.Inner();
		innerObj.msg();
	}
}