package com.version1;

import java.util.Scanner;

public class Circle {
	public static void printArea(double radius) {
		final double PI=3.14159;
		double area=PI*radius*radius;
		System.out.println("Area of a Circle = "+area);
				
	
	}
	public static void printPerimeter(double radius) {
		final double PI=3.14159;
		double perimeter=2*PI*radius;
		System.out.println("Perimeter of a Circle = "+perimeter);
		
	}

	public static void main(String[] apples) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius");
		
         double radius=sc.nextDouble();
         printArea(radius);
         printPerimeter(radius);
 
	}

}
