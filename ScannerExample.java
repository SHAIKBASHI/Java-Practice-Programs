package com.version1;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Byte value");
		
		byte a=sc.nextByte();

System.out.println("Enter the Short value");
		
		short b=sc.nextShort();


System.out.println("Enter the Int value");
		
		int c=sc.nextInt();

System.out.println("Enter the Long value");
		
		long d=sc.nextLong();

System.out.println("Enter the Float value");
		
		float e=sc.nextFloat();
		

System.out.println("Enter the Double value");
		
		double f=sc.nextDouble();
		
System.out.println("Enter the Boolean value");
		
		boolean g=sc.nextBoolean();


System.out.println("Enter the String value");
		
		String h=sc.next();
		
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+" "+g+" "+h);
	}

}
