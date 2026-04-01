package com.sync;

public class BookMyShowTest {

	public static void main(String[] args) {
		BookMyShow obj=new BookMyShow(1);
		
		Thread t1=new Thread(obj,"bashi");
        Thread t2=new Thread(obj,"Prabha");
		Thread t3=new Thread(obj,"Darling");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
