package com.practice;

import java.util.Scanner;

public class WhileFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the integer number");
		Scanner sc=new Scanner(System.in);
		
		
				if(sc.hasNextInt()) {
					
					int number=sc.nextInt();
					
			if(number>0) {
							
					int fact=1;
					int i=1;
					while(i<=number) {
						fact=fact*i;
						i++;
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
