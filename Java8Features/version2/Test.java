package com.version2;

public class Test {

	public static void main(String[] args) {
		int result=0;
		result=Doarthematic.dooperation(10, 20, (a,b)->{return a+b;});
		System.out.println(result);
		
		result=Doarthematic.dooperation(10, 20, (a,b)->{return a*10+b*10;});
		System.out.println(result);
	}

}
