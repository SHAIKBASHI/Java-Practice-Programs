package com.list;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample3 {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<String>();
		list.add("bashi");//01
		list.add("Sai");//02
		list.add("TL");//
		list.add("Akash");
		list.add("TL");
		list.add("Sai");
		list.add(2,"Mahesh");
		for(String name:list) {
			System.out.print(name+" ,");
		}
		System.out.println();
		System.out.println(list.get(4));

	}

	
}
