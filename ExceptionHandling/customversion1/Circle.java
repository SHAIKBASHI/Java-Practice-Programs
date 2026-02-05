package com.custom.version1;

public class Circle {
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
		
	}
	public void printArea() {
		double area=Math.PI*Math.pow(radius, 2);
		System.out.println("Area of circle is "+area);
	}
	public void printPeriMeter() {
		double periMeter=2*Math.PI *radius;
		System.out.println("Peri meter of circle is "+periMeter);
		
	}
  
}
