package com.simplilearn.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 56, 64, 34, 25, 12, 11, 90 };
		SelectionSort.printArray(arr);
		SelectionSort.selectionSort(arr);
		SelectionSort.printArray(arr);
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int min = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}
	}

}
