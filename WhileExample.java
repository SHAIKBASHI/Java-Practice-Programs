package com.version3;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		while(true) {
      System.out.println("Enter your name");
      System.out.println("Enter exit to exit from loop");
      String name=sc.nextLine();
      if(name.equals("exit")) {
    	  break;
      }
      else {
    	   System.out.println("hello "+name+" Good NIght");
      }
   
	
	}
	}

}
