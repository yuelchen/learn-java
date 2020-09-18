package com.yuelchen.threads;

import java.util.Random;

public class GenerateNumber implements Runnable {

	private int minRange = 0;
	
	private int maxRange = 10;
	
	public GenerateNumber() {}
	
	public GenerateNumber(int max) {
		this.maxRange = max;
	}
	
	public GenerateNumber(int min, int max) {
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