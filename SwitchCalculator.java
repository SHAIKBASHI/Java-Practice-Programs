package com.methods;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		double a=sc.nextDouble();
		
		System.out.println("Enter Second Number");
		double b=sc.nextDouble();
		
		System.out.println("Enter Operation + - * / % ");
		char operation=sc.next().charAt(0);
		switch(operation) {
		case '+':System.out.println("Add a,b Value "+(a+b));
		break;
		case '-':System.out.println("sub a,b Value "+(a-b));
		break;
		case '*':System.out.println("Mul a,b Value "+(a*b));
		break;
		case '/':System.out.println("Div a,b Value "+(a/b));
		break;
		case '%':System.out.println("Mod a,b Value "+(a%b));
		break;
		default
		:System.out.println("Invalid operation");
		}
		

	}

}
