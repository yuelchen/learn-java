package com.yuelchen.threads;

import java.util.Random;

public class PrintRandomNumber implements Runnable {

	private int minRange = 0;
	
	private int maxRange = 10;
	
	public PrintRandomNumber() {}
	
	public PrintRandomNumber(int max) {
		this.maxRange = max;
	}
	
	public PrintRandomNumber(int min, int max) {
		this.minRange = min;
		this.maxRange = max;
	}
	
	public void run() {
		Random random = new Random();
		System.out.println(String.format("Random number between '%d' and '%d': %d",
				this.minRange, this.maxRange, 
				random.nextInt(this.maxRange - this.minRange) + this.minRange + 1));
	}
}