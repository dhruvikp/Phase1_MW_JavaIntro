package com.simplilearn.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<>();
		
		queue.add("Dhruvik");
		queue.add("Anas");
		queue.add("Naifat");
		
		
		/*System.out.println(queue.poll());
		System.out.println(queue.poll());*/
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
		

	}

}
