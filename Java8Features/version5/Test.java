package com.version5;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Employee obj=new Employee();
		List<Employee> emplist=new ArrayList<Employee>();
		
		emplist.add(new Employee(44,"Keerthi","Female","Java",75000.00,"Assam"));
		emplist.add(new Employee(45,"Bashi","Male","Python",25000.00,"Bihar"));
		emplist.add(new Employee(46,"Pandey","Female","Java",65000.00,"Hyderabad"));
		emplist.add(new Employee(47,"Pandey","Female","Python",65000.00,"Bihar"));
		emplist.add(new Employee(48,"DoremonGowri","Female","DSA",65000.00,"Chennai"));
		emplist.add(new Employee(49,"Bablu","Male","DSA",37000.00,"Bihar"));
		emplist.add(new Employee(50,"Bablu","Male","Python",85000.00,"Chennai"));
		emplist.add(new Employee(51,"Anjum","Female","Java",67000.00,"Hyderabad"));
		emplist.add(new Employee(52,"Anand Kumar","Male","DSA",97000.00,"Bihar"));
		emplist.add(new Employee(53,"Pallavi","Male","Java",47000.00,"Assam"));
		emplist.add(new Employee(54,"Akbar","Male","DSA",69000.00,"Chennai"));
		
		System.out.println("Male Employee from Bihar");
		emplist.stream()
		       .filter(emp->emp.getGender().equals("Male"))
		       .filter(emp->emp.getLocation().equals("Bihar"))
		       .forEach(emp->System.out.println(emp));
		System.out.println();
		System.out.println("Female Employee from Bihar");
		emplist.stream()
	       .filter(emp->emp.getGender().equals("Female"))
	       .filter(emp->emp.getLocation().equals("Assam"))
	       .forEach(emp->System.out.println(emp));
		System.out.println();
		System.out.println("Male Employee with salary <=50000");
		emplist.stream()
		.filter(emp->emp.getGender().equals("Male"))
	    .filter(emp->emp.getSalary()<=50000.00)
	       .forEach(emp->System.out.println(emp));
		
		System.out.println();
		System.out.println("Female Employee with salary >=50000");
		emplist.stream()
		.filter(emp->emp.getGender().equals("Female"))
	    .filter(emp->emp.getSalary()>=50000.00)
	       .forEach(emp->System.out.println(emp));
		
		System.out.println();
		System.out.println("Display employees in Ascending order of their salary");
		emplist.stream()
		 .sorted(new SalayComparator())
		.forEach(emp->System.out.println(emp));
		System.out.println();
		System.out.println();
		
		System.out.println("Display employees in Ascending order of their Id");
		emplist.stream()
		 .sorted(new IDComparator())
		.forEach(emp->System.out.println(emp));
	}

}
