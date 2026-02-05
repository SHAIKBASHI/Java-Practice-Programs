package com.object.version2;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
			
		}else if(this.getClass()!=obj.getClass()) {
			return false;
		}
		else {
			Employee employee= (Employee) obj;
			if(this.id==employee.id && this.name== employee.name &&this.salary==employee.salary) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	
	
}
