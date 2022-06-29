package com.simplilearn.collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.add("Shiree");
		linkedList.add("Mwila");
		linkedList.add("Naifat");
		linkedList.add("Naifat");
		
		for(String data : linkedList) {
			System.out.println(data);
		}

	}

}
