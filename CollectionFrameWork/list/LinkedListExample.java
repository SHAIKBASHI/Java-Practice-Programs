package com.list;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		List<String> list =new LinkedList<String>();
		list.add("bashi");//01
		list.add("Sai");//02
		list.add("TL");//
		list.add("Akash");
		list.add("TL");
		list.add("Sai");
		
		
		list.set(4, "Update");
		for(String name:list) {
			System.out.print(name+" ,");
		}
		
		

	}

	
}
