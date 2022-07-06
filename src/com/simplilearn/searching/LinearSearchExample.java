package com.simplilearn.searching;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchExample {

	
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the element to be searched:");
			int element = sc.nextInt();
			
			if(LinearSearchExample.exponentialSearch(arr,element)) {
				System.out.println("Element found in array");
			} else {
				System.out.println("Element not found in array");
			}
		}
	}
	
	
	
	public static boolean exponentialSearch(int[] arr, int element) {
		int n = arr.length;
		
		
		if(arr[0] == element) return true;
		
		int x = 1;
		while(x<n && arr[x] <= element) {
			x*=2;
		}
		//return binarySerach(arr, x/2, Math.min(x, n-1), element);
		int val = Arrays.binarySearch(arr, x/2, Math.min(x, n-1), element);
		if(val<0) return false;
		
		return true;
	}

	
	
	
	public static boolean binarySerach(int[] arr, int start, int end, int element) {
		int mid = (start+end)/2;
		
		while(start < end) {
			
			if(arr[mid] < element) {
				start = mid+1;
			} else if(arr[mid] == element) {
				return true;
			} else {
				end = mid-1;	
			}
			mid = (start+end)/2;
		}
		return false;
	}
	
	
	
	
	public static boolean linearSearch(int[] arr, int element) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == element) {
				return true;
			}
		}
		return false;
	}
	
	
}
