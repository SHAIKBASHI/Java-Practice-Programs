package com.version3;

public class Developer {

 private Computer computer;


public Developer(Computer computer) {
	super();
	this.computer = computer;
}


public void startCoding() {
	computer.code();
}
 
}
