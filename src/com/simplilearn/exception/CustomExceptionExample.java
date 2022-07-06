package com.simplilearn.exception;

class Employees {
	
	void getEmployees() throws EmployeeNotFoundException {
		
		throw new EmployeeNotFoundException();
	}
}


public class CustomExceptionExample {

	
	public static void main(String[] args) {
		Employees e = new Employees();
		try {
			e.getEmployees();
		} catch (EmployeeNotFoundException e1) {
			e1.printStackTrace();
		}
	}
}
