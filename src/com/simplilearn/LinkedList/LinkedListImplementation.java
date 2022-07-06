package com.simplilearn.LinkedList;

class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static LinkedList insert(LinkedList list, int data) {
		Node new_node = new Node(data);

		// Scenario 1: List is empty
		if (list.head == null) {
			list.head = new_node;
		} else {

			// Scenario 2: If list is not empty
			Node temp = list.head;

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
		return list;
	}

	public static void printList(LinkedList list) {
		Node temp = list.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("");
	}

	public static LinkedList deleteByKey(LinkedList list, int key) {

		Node temp = list.head;

		// Scenario 1: Node that needs to be deleted is HEAD
		if (temp != null && temp.data == key) {
			list.head = temp.next;
			return list;
		}
		// Scenario 2: Node that needs to be deleted is in between
		Node prev = null;

		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		// We found element to be deleted
		if (temp != null) {
			prev.next = temp.next;
			System.out.println("Found and deleted element: " + key + " ");
		}
		if (temp == null) {
			System.out.println("Not Found element" + key);
		}
		return list;
	}
}

public class LinkedListImplementation {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		LinkedList.insert(list, 2);
		LinkedList.insert(list, 3);
		LinkedList.insert(list, 6);
		LinkedList.insert(list, 10);
		LinkedList.insert(list, 1);

		LinkedList.printList(list);

		LinkedList.deleteByKey(list, 6);
		// LinkedList.deleteByKey(list, 11);

		LinkedList.printList(list);

		LinkedList.deleteByKey(list, 11);
	}

}
