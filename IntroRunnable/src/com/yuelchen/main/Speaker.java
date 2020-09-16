package com.yuelchen.main;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * Speaker is a main method class for demonstrating on using Java Runnable that is 
 * a part of Java API Library. 
 * 
 * @author 	yuelchen
 * @version	1.0.0
 * @since 	2020-08-26
 */
@SuppressWarnings("unused")
public class Speaker {
	
	/**
	 * ArrayList of names;
	 */
	private static List<String> names = new ArrayList<String>();
	
	//====================================================================================================
	
	/**
	 * The main method. 
	 * 
	 * @param args					an array of Strings as main method arguments.
	 */
	public static void main(String[] args) {
		//uncomment the below line if names are passed as arguments
		//names = Arrays.asList(args); 
		
		//default name is names is empty
		if(names.size() == 0) {
			System.out.println("No names provided at runtime, adding default entry");
			names.add("Destiny's Child");
		}
		
		System.out.println(String.format("Main thread is '%s' and has '%d' names", 
				Thread.currentThread().getName(), names.size()));
		for(int i = 0; i < names.size(); i++) {
			Thread thread = new Thread(new SayMyName(names.get(i)));
			thread.start();
		}
	}
}
