package com.custom.version5;

public class Circle {
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
		
	}
	public void printArea() throws RadiusException {
		if(radius<0.0) {
			
				throw new RadiusException("Illegal radius Value");
			
		
		}else {
		double area=Math.PI*Math.pow(radius, 2);
		System.out.println("Area of circle is "+area);}
	}
	public void printPeriMeter()  throws RadiusException {
		if(radius<0.0)  {
			
				throw new RadiusException("Illegal radius Value");
			
		
		}else {
		double periMeter=2*Math.PI *radius;
		System.out.println("Peri meter of circle is "+periMeter);}
		
	}
  
}
