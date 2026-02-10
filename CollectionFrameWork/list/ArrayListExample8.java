package com.list;

import java.util.List;
import java.util.Arrays;

public class ArrayListExample8 {

	public static void main(String[] args) {
		String arr[]= {"bashi","Tl","sai","Akash"};
		List<String> list=Arrays.asList(arr);
		
		for(String x:list) {
			System.out.println(x+" ,");
		}
		

	}

}
