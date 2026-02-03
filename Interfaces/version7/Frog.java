package com.version7;

public class Frog implements Swimable,Jumpable {

	@Override
	public void jump() {
		System.out.println("Frog can Jump");
		
	}

	@Override
	public void swim() {
		System.out.println("Frog can swim");
		
	}

}
