package com.map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class FrequencyOfEachCharacter {
	public static void main(String args[]) {
		String message ="Gandepalii gayathri is a good girl .gayathri from loyla college ";
		
//		LinkedHashMap<Character, Integer> fc=new LinkedHashMap<Character,Integer>();
//		
//		char characters[]=message.toCharArray();
//		
//		for(char ch:characters) {
//			fc.put(ch, fc.getOrDefault(ch , 0)+1);
//		}
//		System.out.println(fc);
//		
		
TreeMap<Character, Integer> fc=new TreeMap<Character,Integer>();
		
		char characters[]=message.toCharArray();
		
		for(char ch:characters) {
			fc.put(ch, fc.getOrDefault(ch , 0)+1);
		}
		System.out.println(fc);
		
		
	}

}
