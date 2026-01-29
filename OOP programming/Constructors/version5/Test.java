package com.constuctors.version5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1=new Employee(111,"bashi",45000.00);
		Employee obj2=new Employee(obj1);//deep copy
		Employee obj3=obj1;//sharoo copy
		
		obj2.id=112;
		
		obj1.getDetails();
		obj2.getDetails();
		obj3.getDetails();

	}

}
