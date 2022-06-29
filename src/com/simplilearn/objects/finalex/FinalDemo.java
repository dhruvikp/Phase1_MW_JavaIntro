package com.simplilearn.objects.finalex;


/*final*/ class A {
	final int a = 99;
	
	final void test() {
		//a++; COMPILATION ERROR
	}
}

class B extends A {
	
	// CAN NOT OVERRIDE FINAL METHOD
	/*void test() { 
	}*/

	

}



public class FinalDemo {

	public static void main(String[] args) {
		
	}

}
