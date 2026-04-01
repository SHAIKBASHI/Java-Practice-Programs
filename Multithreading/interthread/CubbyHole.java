package com.interthread;

public class CubbyHole {
	private int item;
	private boolean available;
	public synchronized void put(int item) {
		while (available==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.item=item;
		available=true;
		notifyAll();
	}
	
	public synchronized int get() {
		while(available) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		available=false;
		notifyAll();
		return item;
		
	}

}
