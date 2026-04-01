package com.version3;

public class ArrayFilter {
	public static void doFilter(int arr[],Filter obj) {
		for(int element:arr) {
			if(obj.filter(element)) {
				System.out.print(element+" ");
			}
		}
		System.out.println();
	}

}
