package com.ciq.demo;

public class Cal {

	public int sum(int a, int b) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return a + b;
	}

}
