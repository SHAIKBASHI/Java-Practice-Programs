package com.version7;

public class Parrot implements Flyable,Walkable {

	@Override
	public void walk() {
		System.out.println("Parrot can Walk");
		
	}

	@Override
	public void fly() {
		System.out.println("Parot can Fly");
		
	}
		

}
