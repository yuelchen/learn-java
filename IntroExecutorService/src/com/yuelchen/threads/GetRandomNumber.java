package com.yuelchen.threads;

import java.util.Random;
import java.util.concurrent.Callable;

public class GetRandomNumber implements Callable<Integer>{

	private int minRange = 0;
	
	private int maxRange = 10;
	
	public GetRandomNumber() {}

	public GetRandomNumber(int max) {
		this.maxRange = max;
	}
	
	public GetRandomNumber(int min, int max) {
		this.minRange = min;
		this.maxRange = max;
	}
	
	@Override
	public Integer call() throws Exception {
		Random random = new Random();
		return random.nextInt(this.maxRange - this.minRange) + this.minRange + 1;
	}
}