package com.socket;

import java.util.Scanner;

public class AlaramExample4 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Day");
		String day=obj.next().toLowerCase();
		String result="";
		switch(day){
		case "sunday","saturday"->result="Hello wakeup at 10 am";
		
		
		case "monday","tueday","wednesday","thursday","friday"->result="Hello wakeup at 7 am";
		
		
		default->result="Please enter valid days";
		}
		System.out.println(result.toLowerCase());

	}

}
