package com.list;
import java.util.Vector;
import java.util.List;



public class VectorExample {

	public static void main(String[] args) {
		
		List<String> list =new Vector<String>();
		list.add("bashi");//01
		list.add("Sai");//02
		list.add("TL");//
		list.add("Akash");
		list.add("TL");
		list.add("Sai");
		
		System.out.println(list.indexOf("bashi"));
		
		System.out.println(list.indexOf("sai"));
		
		System.out.println(list.contains("TL"));
		
		System.out.println(list.contains("MM"));
		
		
		

	}

	
}
