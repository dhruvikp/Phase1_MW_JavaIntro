package com.simplilearn.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> hashSet = new LinkedHashSet<>();

		hashSet.add("Dhruvik");
		hashSet.add("Naifat");
		hashSet.add("Rodney");
		hashSet.add("kara");
		hashSet.add("Rodney");
		

		for (String val : hashSet) {
			System.out.println(val);
		}

	}
}
