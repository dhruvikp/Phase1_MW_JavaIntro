package com.simplilearn.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Test {
	
	void p() throws FileNotFoundException {
		n();
	}
	
	void n() throws FileNotFoundException {
		m();
	}
	
	void m() throws FileNotFoundException {
		System.out.println("Inside m method");
		
		
		throw new FileNotFoundException();
	}
}



public class ExceptionPropagationExample {

	public static void main(String[] args) {
		Test t = new Test();
		try {
			
			
			
			
			t.p();
		} catch(Exception e) {
			System.out.println("Handled in main");
		}
		

	}

}
