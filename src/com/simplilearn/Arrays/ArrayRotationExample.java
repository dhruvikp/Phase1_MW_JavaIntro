package com.simplilearn.Arrays;

public class ArrayRotationExample {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int n = arr.length;
		int k = 7;
		int[] temp = new int[n];
		
		for(int i=0; i<n; i++) {
			temp[(i+k)%n] = arr[i];
		}
		
		for(int val : temp) {
			System.out.print(val);
		}
		

	}

}
