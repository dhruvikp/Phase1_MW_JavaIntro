package com.simplilearn.sorting;

public class QuickSortExample {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int findPiElement(int[] arr, int low, int high) {
		int pi = arr[high];
		int i = low - 1;
		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pi) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			int pi = findPiElement(arr, low, high);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}

	}

	public static void main(String[] args) {

		int[] arr = { 56, 64, 34, 25, 12, 11, 90 };
		QuickSortExample.printArray(arr);
		QuickSortExample.quickSort(arr, 0, arr.length-1);
		QuickSortExample.printArray(arr);
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
