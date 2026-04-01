package com.version4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		String subjects[]= {"Web Programming","Java Programming",
				"Web Services","C Programming","Web Technologies",
				"Middleware Technologies","Scripting Languages","Data Base Management System",
				"Data Warehousing","Java Programming","Web Programming"};
		
		List<String> list=Arrays.asList(subjects);
		
		long count=list.stream().filter(element -> element.startsWith("Data")).count();
		System.out.println("Number of subjects starts with Data="+count);
		System.out.println();
		System.out.println("Subjects start with name Data: ");
		list.stream().filter(element -> element.startsWith("Data"))
		             .forEach(element -> System.out.println(element));
		System.out.println();
		
		count=list.stream().count();
		System.out.println("Total no of subjects="+count);
		
		count=list.stream().distinct().count();
		System.out.println("Total no of subjects without duplicates"+count);
		System.out.println();
		
		System.out.println("Subject ends with Programming & Technologies");
		list.stream().filter(element->element.endsWith("Technologies")||element.endsWith("Programming"))
		.distinct()
		.forEach(element-> System.out.println(element));
		System.out.println();
		
		System.out.println("Subject ends with Programming & Technologies ->Upper Case");
		list.stream()
		    .filter(element->element.startsWith("Web"))
		    .map(element->element.toUpperCase())
		    .forEach(element->System.out.println(element));
		System.out.println();
		
		System.out.println("Elements in ascending order");
		list.stream().sorted().distinct()
		    .forEach(element->System.out.println(element));
		
        System.out.println();
		
		System.out.println("Elements in descending order");
		list.stream().sorted(Collections.reverseOrder()).distinct()
		    .forEach(element->System.out.println(element));
		
	}

}
