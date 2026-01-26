package com.practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the integer number");
		Scanner sc=new Scanner(System.in);
		
		if(sc.hasNextInt()) {
					
			int number=sc.nextInt();
					
			   if(number>0) {
					int fact=1;
					     for(int i=1;i<=number;i++) {
						     fact=fact*i;
				          }
		  System.out.println("Factorial is "+fact);
		 }
		        else {
				    System.out.println("enter positive numbers only");
			         }
		}
		else
		{
			System.out.println("Enter only numbers");
			
		}

	}

}
