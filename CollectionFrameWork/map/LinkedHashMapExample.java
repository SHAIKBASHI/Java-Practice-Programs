package com.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		Map<String,String>students = new LinkedHashMap<String,String>();
		
		students.put("2200032697","Gnana Sai");
		students.put("2200033131","Rishika Reddy");
		students.put("2200032704","Charishma");
		students.put("2200032693","Tharun");
		students.put(null,"Tharun");
		students.put("2200032693",null);
		students.put(null,null);
		System.out.println(students);

		
		students.replace("2200032693", "sample");
		System.out.println(students);
		System.out.println(students.keySet());
		System.out.println(students.values());
		System.out.println(students.get("2200033131"));
		students.remove("2200032693");
		System.out.println(students);
		System.out.println(students.size());
		
		
	}

}
