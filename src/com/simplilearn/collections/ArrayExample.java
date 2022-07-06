package com.simplilearn.collections;

public class ArrayExample {

	public static void main(String[] args) {
		// 1D Array
		// Two ways
		// Option 1:
		int[] arr = new int[9];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[8] = 8;
		
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println("");
		
		
		// Option 2: Create array object, assigning values in one line
		int[] arr1 = {1,2,3,4,5,6};
		for(int i=0; i< arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		
		System.out.println("===================");
		// 2D Array
		int[][] arr2 = 	{
							{11,22},
							{33,44,55}
				
						};
		
		System.out.println(arr2[0][0]);
		
		
		for(int row=0; row<arr2.length; row++) {
			int[] tmp = arr2[row];
			
			for(int col =0; col<tmp.length; col++) {
				System.out.print(arr2[row][col]);
			}
			System.out.println("");
		}
	}
}
