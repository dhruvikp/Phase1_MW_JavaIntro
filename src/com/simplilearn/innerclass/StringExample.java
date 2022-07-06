package com.simplilearn.innerclass;

public class StringExample {

	public static void main(String[] args) {
		String s2 = new String("abc");  // 2
		s2 = "a";						// 1
		s2 = new String("bcd");			// 2
		s2 = new String("a");			// 1

		
		// StringBuilder 
		// Create mutable string
		StringBuilder sb  = new StringBuilder();
		sb.append("a");
		sb.append("b");
		System.out.println(sb.toString());
		
		System.out.println("Method of Strings");
		String s = new String("Hello World");
		
		System.out.println(s.length());
		
		
		String ss1 = "Hello";
		String ss2 = "Hello";
		
		System.out.println(ss1.equals(ss2));
		System.out.println(ss1.toUpperCase());
		System.out.println(ss1.toLowerCase());
		System.out.println(ss1.replace('H', 'E'));
		System.out.println(ss1.charAt(1));
	}
}