package com.constuctors.version2.copy;

public class Employee {
	int id;
	String name;
	double salary;
	final static String company="codegnanit solutions";
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void getDetails() {
		System.out.println(id +" "+name+" "+salary+" "+company);
	}

}
