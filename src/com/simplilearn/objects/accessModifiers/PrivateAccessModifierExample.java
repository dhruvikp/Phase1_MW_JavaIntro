package com.simplilearn.objects.accessModifiers;


class A {
	private int data = 20;
	
	private void msg() {
		System.out.println(data);
	}
}


public class PrivateAccessModifierExample {

	public static void main(String[] args) {
	
		A a = new A();
		//a.msg(); - Compile time error - Not visile
 
	}

}
