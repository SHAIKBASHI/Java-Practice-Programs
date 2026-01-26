package com.version1;

import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		
		final int current_year=2026;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your birth year");
		int by=sc.nextInt();
		int age=current_year - by;
		System.out.println("Your are approximately "+age+"years old in "+current_year);

	}

}
