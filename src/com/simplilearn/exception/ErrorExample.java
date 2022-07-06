package com.simplilearn.exception;

public class ErrorExample {

	
	void a() {
		a();
	}
	
	public static void main(String[] args) {
		
		ErrorExample ee = new ErrorExample();
		ee.a();

	}

}
