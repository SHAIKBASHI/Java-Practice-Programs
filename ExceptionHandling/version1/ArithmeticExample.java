package com.version1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExample {

	public static void main(String[] args) {
		try {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=obj.nextInt();
		
		System.out.println("Enter b value");
		
		int b=obj.nextInt();
		
		int c=a/b;
		
		System.out.println("Division is"+c);
		}
		catch(InputMismatchException e){
			System.out.println("Please Enter valid input");
			
		}
		catch(ArithmeticException e) {
			System.out.println("Dont enter b value as zero");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
