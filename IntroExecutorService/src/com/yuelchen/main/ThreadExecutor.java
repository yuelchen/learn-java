package com.yuelchen.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.yuelchen.threads.GenerateNumber;

public class ThreadExecutor {
	
	public static void main(String[] args) {
		
		//new executor service with 10 threads
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		//invokes a number of runnable objects
		for(int i = 5; i < 1000; i*=5) {
			System.out.println(String.format("Assign runnable with max value of %d", i));
			Runnable runnable = new GenerateNumber(i);
			service.execute(runnable);
		}
	}
}