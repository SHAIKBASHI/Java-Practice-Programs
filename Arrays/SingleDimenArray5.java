package com.version1;

import java.util.Scanner;

public class SingleDimenArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int marks[]= new int[6];
        Scanner sc=new Scanner(System.in);

		
		for(int i=0;i<marks.length;i++) {
			System.out.println("enter  values at index"+i);
	      	marks[i]=sc.nextInt();
		
		}
	
	    for(int i=0;i<marks.length;i++) {
		   System.out.print(marks[i]+" ");
		
		}
		
	}

}


