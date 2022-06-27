package com.simplilearn.objects.polymorphism;


class Calculator {
	
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	int add() {
		return 0;
	}
	
	int add(int a) {
		return a+0;
	}
	
}

public class CompiletimePolimorphism {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result = calc.add(1, 1);
		System.out.println(result);
		
		result = calc.add(1, 1, 1);
		System.out.println(result);
		
		result = calc.add();
		System.out.println(result);
	}

}
