package com.simplilearn.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Anas");
		map.put(2, "Kara");
		map.put(3, "John");
		map.put(1, "Dhruvik");
		
		
		// Iterate map
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			System.out.print(key);
			System.out.println(map.get(key));
		}
		System.out.println("=================");
		
		Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
		
		for(Map.Entry<Integer, String> val : entrySet)  {
			System.out.println(val.getKey() +" "+ val.getValue());
		}
	}
}
