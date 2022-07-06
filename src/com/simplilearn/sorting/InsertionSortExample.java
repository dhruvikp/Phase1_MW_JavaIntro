package com.simplilearn.sorting;

public class InsertionSortExample {

	public static void main(String[] args) {

		int[] arr = { 56, 64, 34, 25, 12, 11, 90 };
		InsertionSortExample.printArray(arr);
		InsertionSortExample.insertionSort(arr);
		InsertionSortExample.printArray(arr);
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void insertionSort(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			int key = arr[i];

			int j = i - 1;
				while (j >= 0 && arr[j] > key) {
					arr[j + 1] = arr[j];			// O(n2)
					j--;
				}
			arr[j + 1] = key;
		}
	}

}
