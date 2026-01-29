package com.version1;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,35,-44,90,-99};
		int max=arr[0];
		int min =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			
			
		}
		
		System.out.println("max="+max);
		System.out.println("min="+min);

	}

}
