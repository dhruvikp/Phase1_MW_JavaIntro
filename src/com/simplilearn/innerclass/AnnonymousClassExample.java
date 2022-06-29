package com.simplilearn.innerclass;



abstract class AnonymousTest {
	abstract void test();
}

// How to make abstract class as complete class?
// You need to create any class, that extends Abstract class
// provide implementation of incomplete method i.e. test

public class AnnonymousClassExample {

	public static void main(String[] args) {
		AnonymousTest obj = new AnonymousTest() {
			void test() {
				System.out.println("Hello Simplilearn!");
			}
		};
		obj.test();
	}
}
