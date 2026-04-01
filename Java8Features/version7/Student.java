package com.version7;

public class Student {
	private String fname;
	private String lname;
	public  Student(String fname,String lname) {
		this.fname=fname;
		this.lname=lname;
	}
	public String getFullName() {
		assert fname!="":"First name must not be null";
		assert lname!="":"Last name must not be null";
		assert fname!=null:"First name must not be null";
		assert lname!=null:"Last name must not be null";
		
		return fname.concat(" ").concat(lname);
		
	}
	

}
