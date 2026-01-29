package com.constuctors.version6;

public class Employee {
	public Employee() {
		// TODO Auto-generated constructor stub
		this(10);
		System.out.println("Default Constructor");
	}
	public Employee(int x) {
		// TODO Auto-generated constructor stub
		this("name");
		System.out.println("int parameter Constructor");
	}
	public Employee(String x) {
		// TODO Auto-generated constructor stub
		System.out.println("String parameter Constructor");
	}

}
