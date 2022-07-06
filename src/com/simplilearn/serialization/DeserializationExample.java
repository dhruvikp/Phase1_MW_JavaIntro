package com.simplilearn.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("file.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Demo d = (Demo)ois.readObject();
		
		
		System.out.println("Object has been deserialized");
		System.out.println("a="+d.a);
		System.out.println("b="+d.b);

	}
	
}
