package com.yuelchen.main;

import java.util.concurrent.Callable;

/**
 * SayMyName is a callable class for simply repeating the given name; 43 by default.
 * 
 * @author 	yuelchen
 * @version	1.0.0
 * @since 	2020-09-15
 */
public class SayMyName implements Callable<String> {

	/**
	 * The name to be said.
	 */
	private String name;
	
	//====================================================================================================
	
	/**
	 * The number of times the name should be said. 
	 */
	private int numberOfTimes;
	
	//====================================================================================================
	
	/**
	 * Constructor
	 * 
	 * @param name			the name to be repeated.
	 */
	public SayMyName(String name) {
		this.name = name;
		this.numberOfTimes = 43; 
	}
	
	//====================================================================================================
	
	/**
	 * Constructor 
	 * 
	 * @param name			the name to be repeated.
	 * @param times			the number of times to repeat name. 
	 */
	public SayMyName(String name, int times) {
		this.name = name;
		this.numberOfTimes = times;
	}
	
	//====================================================================================================
	
	/**
	 * Prints a comma or nextline depending on given index; if index
	 * is less than number of time, then print a comma-space delimiter, 
	 * else print a new line. 
	 * 
	 * @param index		the given index.
	 */
	private void commaOrEnding(int index) {
		if(index + 1 < this.numberOfTimes) {
			System.out.print(", ");
		} else {
			System.out.println("");
		}
	}
	
	//====================================================================================================
	
	/**
	 * Prints the duration of runtime by subtracting difference and divide by 1,000
	 * to get macro-seconds duration.
	 * 
	 * @param startNano		the start time of runtime in nano-seconds.
	 * @param endNano		the end time of runtime in nano-seconds.
	 */
	private String printRuntimeDuration(long startNano, long endNano) {
		long difference = ((endNano - startNano) / 1000L);
		return String.format("Thread for name '%s' completed in '%d milli-seconds'", 
				this.name, difference);
	}
	
	//====================================================================================================
	
	@Override
	public String call() throws Exception {
		long startTimeNano = System.nanoTime();
		System.out.print("Say my name: ");
		for(int i = 0; i < this.numberOfTimes; i++) {
			System.out.print(name);
			this.commaOrEnding(i);
		}
		long endTimeNano = System.nanoTime();
		
		return this.printRuntimeDuration(startTimeNano, endTimeNano);
	}
}