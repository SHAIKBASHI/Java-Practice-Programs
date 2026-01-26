package com.version3;

import java.util.Scanner;

public class EligibilityChecker {

	public static void main(String[] args) {
		
		Scanner obj= new Scanner(System.in);
		
		System.out.println("Enter your age:");
		if(obj.hasNextInt()) {
			int age=obj.nextInt();
			if (age >=0 && age<=100) {
				if (age>=18) {
					System.out.println("Your eligible for vote");
				}
				else {
					System.out.println("Age is Less than 18 .Your not eligible for vote");
				}
				
			}else {
				System.out.println("Please enetr valid age between 0 to 100 ");
			}
		}
		else {
			System.out.println("Please enter  integer only");
		}
		

	}

}
