package com.simplilearn.innerclass;

public class LocalInnerClassExample {

	private String msg = "Simplilearn";
	
	void display() {
		// Any class created inside method - Local Inner Class
		class Inner {
			void msg() {
				System.out.println(msg);
			}
		}

		Inner inner = new Inner();
		inner.msg();
	}
	
	
	public static void main(String[] args) {
		LocalInnerClassExample outer = new LocalInnerClassExample();
		outer.display();

	}

}
