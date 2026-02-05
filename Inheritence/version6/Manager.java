package com.version6;

public class Manager extends Employee {
    private String dop;
	public Manager(int id, String name, double salary) {
		super(id, name, salary);
		
	}@Override
	public double bonus() {
		return 2*super.bonus();
	}
	public String getDop() {
		return dop;
	}
	public void setDop(String dop) {
		this.dop = dop;
	}
	

}
