package com.simplilearn.recursion;

public class RecursionUnderstandingExample {

	
	String inception(int counter) {
		System.out.println("invoked inception");
		// base condition
		if(counter>3) {
			return "Done";
		}
		
		counter++;
		return counter+inception(counter);
	}
	
	
	public static void main(String[] args) {
		RecursionUnderstandingExample re = new RecursionUnderstandingExample();
		System.out.println(re.inception(0));
	}

}
