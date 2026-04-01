package com.interthread;

public class Test {

	public static void main(String[] args) {
		CubbyHole cb=new CubbyHole();
		Producer producer=new Producer(cb);
		Consumer consumer=new Consumer(cb);
		
		producer.start();
		consumer.start();
		
	}

}
