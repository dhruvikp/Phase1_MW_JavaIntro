package com.simplilearn.sorting;

public class BubbleSortExample {

	public static void main(String[] args) {

		int[] arr = { 56, 64, 34, 25, 12, 11, 90 };
		BubbleSortExample.printArray(arr);
		BubbleSortExample.bubbleSort(arr);
		BubbleSortExample.printArray(arr);
	}
	
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	static void bubbleSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int temp = 0;
			for (int j = 1; j < n; j++) {

				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
