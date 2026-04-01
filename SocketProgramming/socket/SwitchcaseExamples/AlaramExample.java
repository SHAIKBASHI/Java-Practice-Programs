package com.socket;

import java.util.Scanner;

public class AlaramExample {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Day");
		String day=obj.next().toLowerCase();
		
		switch(day){
		case "sunday":System.out.println("Hello wakeup at 10 am");
		break;
		case "saturday":System.out.println("Hello wakeup at 10 am");
		break;
		case "monday":System.out.println("Hello wakeup at 7 am");
		break;
		case "tueday":System.out.println("Hello wakeup at 7 am");
		break;
		case "wednesday":System.out.println("Hello wakeup at 7 am");
		break;
		case "thursday":System.out.println("Hello wakeup at 7 am");
		break;
		case "friday":System.out.println("Hello wakeup at 7 am");
		break;
		default:System.out.println("Please enter valid days");
		}

	}

}
