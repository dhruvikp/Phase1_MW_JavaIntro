package com.simplilearn.Arrays;

import java.util.Arrays;

public class ArraysFindKthSmallestElement {
	public static void main(String[] args) {
		int[] arr = {10, 12,3,5,7,19};
		int k= 1;
		Arrays.sort(arr);
		System.out.println(arr[k-1]);
	}
}
