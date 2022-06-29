package com.simplilearn.collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("Dhruvik");
		hashSet.add("Naifat");
		hashSet.add("Rodney");
		hashSet.add("kara");
		hashSet.add("Rodney");
		hashSet.add(null);
		hashSet.add(null);
		
		
		for(String val : hashSet) {
			System.out.println(val);
		}

	}

}
