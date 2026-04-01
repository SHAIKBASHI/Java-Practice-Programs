package com.version1;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread obj=new Mythread();
		Thread t1=new Thread(obj,"Bashi");
		Thread t2=new Thread(obj,"Prabha");
		Thread t3=new Thread(obj,"Boss");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
