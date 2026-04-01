package com.version1;

public class Mythread implements Runnable {
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" Executed");
		System.out.println(Thread.currentThread());
	}

}
