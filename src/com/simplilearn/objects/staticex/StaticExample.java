package com.simplilearn.objects.staticex;


class  A {
	static int counter=0;
	
	A() {
		counter++;
	}
}

public class StaticExample {
	static int a=5;
	
	public static void main(String[] args) {
		//System.out.println(StaticExample.a);
		A a = new A();
		
		A a1 = new A();
		A a2 = new A();
		
		System.out.println(A.counter);
	}
}
