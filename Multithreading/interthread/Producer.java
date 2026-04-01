package com.interthread;

public class Producer extends Thread {
	private CubbyHole cb;

	public Producer(CubbyHole cb) {
	
		this.cb = cb;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Producer inserted item"+i);
		cb.put(i);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	

}
