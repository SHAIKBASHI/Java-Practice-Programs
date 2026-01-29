package com.constuctors.version1;

public class Employee {
	int id;
	String name;
	double salary;
	final static String company="codegnanit solutions";
	public Employee() {
		System.out.println("object ceated----------");
	}
	public void getDetails() {
		System.out.println(id +" "+name+" "+salary+" "+company);
	}

}
