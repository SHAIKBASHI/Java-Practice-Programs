package com.practice;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range");
		int range=sc.nextInt();
		int first=0;
		int second=1;
		System.out.print(first+" "+second+" ");
		 for(int i=3;i<=range;i++) {
			  int next=first+second;
			  System.out.print(next+" ");
			  first=second;
			  second=next;
		 }
		
		
	}

}
