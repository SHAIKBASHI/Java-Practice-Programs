package com.version1;

import java.util.Scanner;

public class SingleDimenArray6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double marks[]= new double[6];
        Scanner sc=new Scanner(System.in);

		
		for(int i=0;i<marks.length;i++) {
			System.out.println("enter  values at index "+i);
	      	marks[i]=sc.nextDouble();
		
		}
	    double sum=0.0,average=0.0;
	    for(int i=0;i<marks.length;i++) {
	    	sum=sum+marks[i];
		   
		
		}
	   average=sum/marks.length;
	   System.out.println("Sum value "+sum);
	   System.out.println("Average value "+average);
	}

}


