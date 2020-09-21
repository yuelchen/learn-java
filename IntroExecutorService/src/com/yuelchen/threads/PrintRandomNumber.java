package com.yuelchen.threads;

import java.util.Random;

public class PrintRandomNumber implements Runnable {

	/**
	 * Minimum range for random number.
	 */
	private int minRange = 0;
	
	//====================================================================================================
	
	/**
	 * Maximum range for random number.
	 */
	private int maxRange = 10;
	
	//====================================================================================================
	
	 /**
	  * Constructor
	  */
	public PrintRandomNumber() {}
	
	//====================================================================================================
	
	/**
	 * Constructor 
	 * 
	 * @param max			the maximum range for random number.
	 */
	public PrintRandomNumber(int max) {
		this.maxRange = max;
	}
	
	//====================================================================================================
	
	/**
	 * Constructor
	 * 
	 * @param min			the minimum range for random number.
	 * @param max			the maximum range for random number.
	 */
	public PrintRandomNumber(int min, int max) {
		this.minRange = min;
		this.maxRange = max;
	}
	
	//====================================================================================================
	
	/**
	 * Run method for runnable class. 
	 */
	public void run() {
		Random random = new Random();
		System.out.println(String.format("Random number between '%d' and '%d': %d",
				this.minRange, this.maxRange, 
				random.nextInt(this.maxRange - this.minRange) + this.minRange + 1));
	}
}