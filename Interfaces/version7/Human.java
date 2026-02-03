package com.version7;

public class Human implements Walkable,Swimable,Jumpable{

	@Override
	public void jump() {
		System.out.println("He can Jump");
		
	}

	@Override
	public void swim() {
		System.out.println("He can Swim");
		
	}

	@Override
	public void walk() {
		System.out.println("He can Walk");
		
	}

}
