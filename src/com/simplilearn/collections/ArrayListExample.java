package com.simplilearn.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(8);
		arrList.add(7);
		arrList.add(9);
		arrList.add(9);
		
		arrList.remove(0);
		
		// WAY - 1 - using iterator API
		Iterator<Integer> listItr = arrList.iterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		System.out.println("=============");
		
		// WAY - 2 - JDK 8 
		for(Integer val : arrList) {
			System.out.println(val);
		}
	}
}
