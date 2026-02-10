package com.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample7 {

	public static void main(String[] args) {
		
		List<Integer> list=List.of(-11,145,34,67,89,9,3,4,200);
		
		ArrayList<Integer> a1=new ArrayList<Integer>(list);
		
		System.out.println(a1);
		
		
		Collections.sort(a1);
		System.out.println(a1);
	}

	
}
