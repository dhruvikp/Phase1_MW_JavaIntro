package com.simplilearn.collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> vectorList = new Vector<>();

		vectorList.add("Dhruvik");
		vectorList.add("Kara");
		vectorList.add("MWila");
		vectorList.add("Naifat");

		for (String data : vectorList) {
			System.out.println(data);
		}

	}

}
