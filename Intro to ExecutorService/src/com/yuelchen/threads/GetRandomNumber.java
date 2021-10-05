package com.yuelchen.threads;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * Callable class for printing random number.
 * 
 * @author	yuelchen
 * @version	1.0.0
 * @since	2020-09-20
 */
public class GetRandomNumber implements Callable<Integer>{

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
	 * Constructor.
	 */
	public GetRandomNumber() {}
	
	//====================================================================================================

	/**
	 * Constructor.
	 * 
	 * @param max			the maximum range for random number.
	 */
	public GetRandomNumber(int max) {
		this.maxRange = max;
	}
	
	//====================================================================================================
	
	/**
	 * Constructor
	 * 
	 * @param min			the minimum range for random number.
	 * @param max			the maximum range for random number.
	 */
	public GetRandomNumber(int min, int max) {
		this.minRange = min;
		this.maxRange = max;
	}
	
	//====================================================================================================
	
	/**
	 * Callable method for callable class.
	 */
	@Override
	public Integer call() throws Exception {
		Random random = new Random();
		return random.nextInt(this.maxRange - this.minRange) + this.minRange + 1;
	}
}