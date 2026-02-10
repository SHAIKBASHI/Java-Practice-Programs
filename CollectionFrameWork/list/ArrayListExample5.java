package com.list;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample5 {

	public static void main(String[] args) {
		//deletion exaple
		List<String> list =new ArrayList<String>();
		list.add("bashi");//01
		list.add("Sai");//02
		list.add("TL");//
		list.add("Akash");
		list.add("TL");
		list.add("Sai");
		System.out.println(list.size());
		list.remove(2);
		list.remove("bashi");
		for(String name:list) {
			System.out.println(name+" ,");
		}
		System.out.println(list.size());
		
		

	}

	
}
