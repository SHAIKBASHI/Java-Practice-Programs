package com.object.version2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Employee obj1=new Employee(111,"bashi",45000.00);
		
		Employee obj2=new Employee(111,"bashi",45000.00);
		
		System.out.println(obj1.equals(null));
		
		System.out.println(obj1.equals(new Scanner (System.in)));
		
		System.out.println(obj1.equals(obj2));
		 
		

	}

}
