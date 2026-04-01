package com.version6;

import java.util.Optional;

public class OptionalClasses {

	public static void main(String[] args) {
		String names[]= {"bashi",null,"prabha",null,"darling",null,"salaar",null};
//		for(String n:names) {
//			if(names!=null) {
//				System.out.println(n.toUpperCase());
//			}
//			else {
//				System.out.println("Null value found");
//			}
		
		
		
//		for(String n:names) {
//			try {
//			 
//				System.out.println(n.toUpperCase());
//			}
//			
//			catch(NullPointerException e){
//				System.out.println("Null value found");
//			}
//		}
//		for(String n:names) {
//			Optional<String> optional=Optional.ofNullable(n);
//			optional.ifPresent(v->System.out.println(v.toUpperCase()));
//		}
		for(String n:names) {
			Optional<String> optional=Optional.ofNullable(n);
			optional.ifPresentOrElse(v->System.out.println(v.toUpperCase()), ()->System.out.println("Null value Found"));
		}
	}

}
