package com.version3;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=======================");
		System.out.println("=======================");
		System.out.println("Welcome to Codegnan");
		System.out.println("Courses Offered");
		System.out.println("1.Python 2.Java 3.Mern 4.DSA");
		System.out.println("=======================");
		System.out.println("=======================");
		System.out.println("Enter your Preferred course");
		
		String course=sc.next().toUpperCase();
		switch(course) {
		case "JAVA":System.out.println("Duration 100 days");
		System.out.println("Fee 50k");
		break;
		case "PYTHON":System.out.println("Duration 100 days");
		System.out.println("Fee 40k");
		break;
		case "MERN":System.out.println("Duration 100 days");
		System.out.println("Fee 45k");
		break;
		case "DSA":System.out.println("Duration 100 days");
		System.out.println("Fee 53k");
		break;
		default:System.out.println("Sorry we are not Providing this course");
		
		}
		

	}

}
