package com.yuelchen.main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Speaker is a main method class for demonstrating on using Java Callable that is 
 * a part of Java API Library. 
 * 
 * @author 	yuelchen
 * @version	1.0.0
 * @since 	2020-08-26
 */
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
			Callable<String> callableTask = new SayMyName(names.get(i));
			FutureTask<String> futureTask = new FutureTask<String>(callableTask);
			
			Thread thread = new Thread(futureTask);
			thread.start();
			
			//print out response
			try {
				System.out.println(String.format("Respone for name '%s': %s", 
						names.get(i), futureTask.get()));
			} catch(Exception e) {
				System.out.println(String.format("Unable to retrieve result for name '%s' "
						+ "due to Exception with message '%s'; caused by '%s'", 
						names.get(i), e.getMessage(), e.getCause().toString()));
			}
		}
	}
}