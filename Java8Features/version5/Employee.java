package com.version5;

public class Employee {
	private int id;
	private String name;
	private String gender;
	private String depatment;
	private double salary;
	private String location;
	public Employee() {
		
	}
	public Employee(int id, String name, String gender, String depatment, double salary, String location) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.depatment = depatment;
		this.salary = salary;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepatment() {
		return depatment;
	}
	public void setDepatment(String depatment) {
		this.depatment = depatment;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", depatment=" + depatment + ", salary="
				+ salary + ", location=" + location + "]";
	}

}
