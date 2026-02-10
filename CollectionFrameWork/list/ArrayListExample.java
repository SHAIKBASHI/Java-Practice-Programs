package com.list;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<String>();
		list.add("bashi");//01
		list.add("Sai");//02
		list.add("TL");//
		list.add("Akash");
		list.add("TL");
		list.add("Sai");
		for(String name:list) {
			System.out.println(name+" ,");
		}
		
		

	}

	
}
