package com.custom.version2;

public class Circle {
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
		
	}
	public void printArea() {
		if(radius<0.0) {
			try {
				throw new RadiusException("Illegal Value");
			}catch(RadiusException e){
				System.out.println("Negative values not allowed");
				
			}
		
		}else {
		double area=Math.PI*Math.pow(radius, 2);
		System.out.println("Area of circle is "+area);}
	}
	public void printPeriMeter() {
		if(radius<0.0) {
			try {
				throw new RadiusException("Illegal Value");
			}catch(RadiusException e){
				System.out.println("Negative values not allowed");
				
			}
		
		}else {
		double periMeter=2*Math.PI *radius;
		System.out.println("Peri meter of circle is "+periMeter);}
		
	}
  
}
