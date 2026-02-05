package com.version1;

public class NestedTry {

	public static void main(String[] args) {
		 String names[]= {"Akash Rocky",null,"Super Spirit",null,"Sai Sanddy",null,"Captain Miller"};
		 
		 
		 for(String x: names) {
			 try {
				 System.out.println(x.toUpperCase());
				 try {
					 char ch=x.charAt(10);
					 System.out.println(ch);
				 }
				 catch(StringIndexOutOfBoundsException e) {
					 System.out.println("No 10th index");
				 }
			 }
			 catch(NullPointerException e) {
				 System.out.println("Null Value");
				 
			 }
		 }

	}

}
