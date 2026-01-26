package com.practice;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Factorial1 f1=new Factorial1();
		System.out.println("Enter a number");
		if(sc.hasNextInt()) {
			int number=sc.nextInt();
			int originalNumber=number;
			int sum=0;
			while(number>0){
				int digit =number%10;
				sum=sum+f1.fact(digit);
				number=number/10;
			}
			if(sum==originalNumber) {
				System.out.println("It is a strong number");
			}
			else
			{
				System.out.println("Not a stong number");
			}
			
		}
		else
		{
			System.out.println("Enter Number Only");
		}
		
	}

}
