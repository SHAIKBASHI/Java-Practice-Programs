package com.constuctors.version5;

public class Employee {
	int id;
	String name;
	double salary;
	final static String company="codegnanit solutions";
	public Employee(int x,String y,double z) {//Parameterized constructor

		id=x;
		name=y;
		salary=z;
	}
	public Employee(Employee obj) {//copy constructor
		this.id=obj.id;
		this.name=obj.name;
		this.salary=obj.salary;
	}
	public void getDetails() {
		System.out.println(id +" "+name+" "+salary+" "+company);
	}

}
