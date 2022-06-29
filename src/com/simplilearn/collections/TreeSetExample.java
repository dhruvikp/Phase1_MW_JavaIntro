package com.simplilearn.collections;

import java.util.TreeSet;

public class TreeSetExample {

	
	
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("Dhruvik");
		treeSet.add("Naifat");
		treeSet.add("Rodney");
		treeSet.add("kara");
		treeSet.add("Rodney");
		treeSet.add("Anas");
		

		for (String val : treeSet) {
			System.out.println(val);
		}
	}
	
}

