package com.custom.version4;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle obj2=new Circle(-7.56321);
		try {
		obj2.printArea();
		}
		catch(RadiusException e) {
			System.out.println(e.getMessage());
		}try {
		obj2.printPeriMeter();
		}
		catch(RadiusException e) {
			System.out.println(e.getMessage());
		}

	}
}
