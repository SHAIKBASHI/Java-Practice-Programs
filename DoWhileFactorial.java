package com.practice;

import java.util.Scanner;

public class DoWhileFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the integer number");
		Scanner sc=new Scanner(System.in);
		
		
				if(sc.hasNextInt()) {
					
					int number=sc.nextInt();
					
			if(number>0) {
							
					int fact=1;
					int i=1;
					do {
						fact=fact*i;
						i++;
					}while(i<=number);
			System.out.println("Factorial is "+fact);
			}
			else {
				System.out.println("enter positive numbers only");
				
			}
				
		}else {
			System.out.println("Enter only numbers");
			
		}
		
				
				
		
	}

}
