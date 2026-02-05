package com.version5;

public class Manager extends Employee {

	public Manager(int id, String name, double salary) {
		super(id, name, salary);
		
	}@Override
	public double bonus() {
		return 2*super.bonus();
	}
	

}
