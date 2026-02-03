package com.version1;

public class Test {

	public static void main(String[] args) {
		User bashi=new User();
		bashi.getFood(new Zomato());
		
		User gayathri=new User();
		gayathri.getFood(new Swiggy());
		
		User teja=new User();
		teja.getFood(new KFC());

	}

}
