package com.simplilearn.objects.inheritance;


class A {
	long salary = 50000;
	
	public void earning() {
		System.out.println(salary);
	}
}

class B extends A {
	
}



public class InheritanceExample {

	public static void main(String[] args) {
		
		B b = new B();
		b.earning();
	}

}
