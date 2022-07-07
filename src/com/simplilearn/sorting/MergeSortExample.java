package com.simplilearn.sorting;

public class MergeSortExample {

	static void merge(int[] arr, int left, int middle, int right) {
		int n1 = middle - left + 1;
		int n2 = right - middle;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[left + i];
		}

		for (int j = 0; j < n2; j++) {
			R[j] = arr[middle + 1 + j];
		}

		int k = left;
		int i = 0;
		int j = 0;

		while (i < n1 && j < n2) {
			if (L[i] < R[j]) {
				arr[k++] = L[i++];
			} else {
				arr[k++] = R[j++];
			}
		}

		while (i < n1) {
			arr[k++] = L[i++];
		}

		while (j < n2) {
			arr[k++] = R[j++];
		}

	}

	static void mergeSort(int[] arr, int left, int right) {

		if (left < right) {
			int m = (left + right) / 2;

			mergeSort(arr, left, m);
			mergeSort(arr, m + 1, right);

			merge(arr, left, m, right);
		}

	}

	public static void main(String[] args) {

		int[] arr = { 56, 64, 34, 25, 12, 11, 90 };
		MergeSortExample.printArray(arr);
		MergeSortExample.mergeSort(arr, 0, arr.length-1);
		MergeSortExample.printArray(arr);
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
