package com.custom.version5;

public class CircleTest {

	public static void main(String[] args) {
		
		
		Circle obj2=new Circle(-7.56321);
		try {
		obj2.printArea();
		}
		catch(RadiusException e) {
			//System.out.println(e);
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}try {
		obj2.printPeriMeter();
		}
		catch(RadiusException e) {
			//System.out.println(e);
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
