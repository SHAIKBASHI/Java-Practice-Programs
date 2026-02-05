package com.version4;

public interface University {
	void infra();
	static void sfratio() {
		System.out.println("20:1");
	}
	default void questionPaper() {
		System.out.println("QP from University");
		
	}
	
}
