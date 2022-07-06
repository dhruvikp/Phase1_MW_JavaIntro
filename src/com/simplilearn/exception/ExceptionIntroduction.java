package com.simplilearn.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionIntroduction {

	public static void main(String[] args) {
		System.out.println("stmt1");
		System.out.println("stmt2");
		System.out.println("stmt3");
		System.out.println("stmt4");
		System.out.println("stmt5");
		
		try {
			
			FileInputStream fis = new FileInputStream("file1.ser");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// Finally blocks ensure getting invoked
			System.out.println("Finally block executed");
		}
		
		
		
		
		System.out.println("stmt6");
		System.out.println("stmt7");
		System.out.println("stmt8");
	}
	
}
