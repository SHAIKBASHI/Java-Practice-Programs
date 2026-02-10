package com.map;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
	public static void main(String[] args) {
		Map<String,String>students = new TreeMap<String,String>();
		
		students.put("2200032697 "," Gnana Sai");
		students.put("2200033131 "," Rishika Reddy");
		students.put("2200032704 "," Charishma");
		students.put("2200032693 "," Tharun");
		students.put("2200032693 ", null);
		

		System.out.println(students);

		
		
		
	}

}
