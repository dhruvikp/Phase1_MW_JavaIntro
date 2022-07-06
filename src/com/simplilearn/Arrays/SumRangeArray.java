package com.simplilearn.Arrays;

public class SumRangeArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int l = 1;
		int r = 3;
		
		method1(arr, l, r);
		method2(arr, l, r);
	}
	
	private static void method2(int[] arr, int l, int r) {
		int n = arr.length;
		int[] pre = new int[n];
		pre[0] = arr[0];
		
		for(int i=1; i<n; i++) {
			pre[i] = pre[i-1]+arr[i];
		}
		
		System.out.println(pre[r] - pre[l-1]);
	}

	private static void method1(int[] arr, int l, int r) {
		int sum =0;
		for(int i=l; i<=r; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
