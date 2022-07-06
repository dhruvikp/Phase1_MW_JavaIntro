package com.simplilearn.Stack;

class Stack {
	static final int MAX = 1000;
	int[] arr = new int[MAX];

	int top;

	public Stack() {
		top = -1;
	}

	/**
	 * Pushing x into stack, if successfully done, returns true, else return false
	 */
	boolean push(int x) {
		if (top >= MAX - 1) {
			System.out.println("Stack overflow");
			return false;
		}
		arr[++top] = x;
		System.out.println(x + " Pushed successfully in stack");
		return true;
	}

	/**
	 * Return and remove Top element from stack
	 */
	int pop() {
		if (top < 0) {
			System.out.println("Stack underflow");
			return 0;
		}
		return arr[top--];
	}

	/**
	 * Print Stack
	 */
	void print() {

		for (int i = top; i > -1; i--) {
			System.out.print(" " + arr[i]);
		}
System.out.println("");
	}

}

public class StackExample {

	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.print();
		
		int x = stack.pop();
		System.out.println(x + " successfully popoed out");
		stack.print();
		
		 x = stack.pop();
		System.out.println(x + " successfully popoed out");
		stack.print();

	}

}
