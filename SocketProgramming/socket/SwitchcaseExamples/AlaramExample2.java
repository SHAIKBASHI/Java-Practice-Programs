package com.socket;

import java.util.Scanner;

public class AlaramExample2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Day");
		String day=obj.next().toLowerCase();
		
		switch(day){
		case "sunday","saturday":System.out.println("Hello wakeup at 10 am");
		break;
		
		case "monday","tueday","wednesday","thursday","friday":System.out.println("Hello wakeup at 7 am");
		break;
		
		default:System.out.println("Please enter valid days");
		}

	}

}
