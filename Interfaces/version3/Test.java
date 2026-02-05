package com.version3;

public class Test {

	public static void main(String[] args) {
		Computer obj;
		
		 obj=new Desktop();
		Developer sai= new Developer(obj);
		sai.startCoding();
		
		 obj=new Laptop();
		Developer gayatri=new Developer(obj);
		gayatri.startCoding();

	}

}
