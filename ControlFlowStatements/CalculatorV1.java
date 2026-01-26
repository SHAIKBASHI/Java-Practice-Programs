package com.methods;

import java.util.Scanner;

public class CalculatorV1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		double a=sc.nextDouble();
		
		System.out.println("Enter Second Number");
		double b=sc.nextDouble();
		
		System.out.println("Enter Operation + - * / % ");
		char operation=sc.next().charAt(0);
		
		if (operation=='+') {
			double result=Arthmetic.add(a,b);
			System.out.println("Addition is "+result);
		}
		else 
		{
			if (operation=='-') 
			{
			double result=Arthmetic.sub(a,b);
			System.out.println("Subtraction is "+result);
		    }
			else 
			{
				if (operation=='*') 
				{
				double result=Arthmetic.mul(a,b);
				System.out.println("Multiplication is "+result);
			    }
				else
				{
					if (operation=='/') 
					{
					double result=Arthmetic.div(a,b);
					System.out.println("Division is "+result);
				    }
					else
					{
						if (operation=='%') 
						{
						double result=Arthmetic.mod(a,b);
						System.out.println("ModuloDivision is "+result);
					    }
						else
						{
							System.out.println("Invalid Operation");
						}
					}
				}
			}
		}
	}

}
