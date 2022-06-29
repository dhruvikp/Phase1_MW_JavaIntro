package com.simplilearn.collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("Dhruvik");
		stack.push("Rodney");
		stack.push("Kara");
		stack.push("Naifat");
		stack.push("Simplilearn");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		

	}

}
