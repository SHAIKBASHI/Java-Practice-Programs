package com.version7;


public class Factorial {
	
	public static int factorial(int n) {
		
		assert n >= 0 : "Input can't be negative";
		int fact=1;
		for(int i=1;i<=n;i++) {
		 fact=fact*i;
		}
		
	return fact;
	}

	public static void main(String[] args) {
		
		int result=factorial(5);
		System.out.println(result);
		int result1=factorial(-1);
		System.out.println(result1);
		
		
		
   
	}

}
