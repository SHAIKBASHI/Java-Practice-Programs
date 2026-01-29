package com.constuctors.version3;

public class Employee {
	int id;
	String name;
	double salary;
	final static String company="codegnanit solutions";
	public Employee(int x,String y,double z) {
		id=x;
		name=y;
		salary=z;
	}
	public void getDetails() {
		System.out.println(id +" "+name+" "+salary+" "+company);
	}

}
