package com.constuctors.version4;

public class Employee {
	int id;
	String name;
	double salary;
	final static String company="codegnanit solutions";
	public Employee() {
		System.out.println("Default Constructor");
	}
	
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public void getDetails() {
		System.out.println(id +" "+name+" "+salary+" "+company);
	}

}
