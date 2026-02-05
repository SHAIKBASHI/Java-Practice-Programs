package com.version2;

public class Developer {
//	private Desktop desktop;
//	public Developer(Desktop desktop) {
//		this.desktop=desktop;
//	}
//	public void startCoding() {
//		desktop.codeInDesktop();
//	}
//	
 private Laptop laptop;

public Developer(Laptop laptop) {
	
	this.laptop = laptop;
}
public void startCoding() {
	laptop.codeInLaptop();
}
 
}
