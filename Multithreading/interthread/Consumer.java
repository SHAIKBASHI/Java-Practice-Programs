package com.interthread;

public class Consumer extends Thread{
	private CubbyHole cb;

	public Consumer(CubbyHole cb) {
	
		this.cb = cb;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			int item=cb.get();
			System.out.println("Consumer got item"+item);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
