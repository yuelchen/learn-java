package com.yuelchen.main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.yuelchen.threads.GetRandomNumber;
import com.yuelchen.threads.PrintRandomNumber;

public class ThreadExecutor {
	
	public static void main(String[] args) {
		
		//new executor service with 10 threads
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		//invokes a number of runnable objects
		for(int i = 5; i < 1000; i*=5) {
			Runnable runnable = new PrintRandomNumber(i);
			System.out.println(String.format("Assign runnable with max value of %d", i));
			service.execute(runnable);
		}
		
		//invokes a number of callable objects
		List<Future<Integer>> future = new ArrayList<>();
		for(int i = 3; i < 1000; i*=3) {
			Callable<Integer> callable = new GetRandomNumber(i);
			System.out.println(String.format("Assign callable with max value of %d", i));
			future.add(service.submit(callable));
		}
		
		//retrieves results for getting random numbers
		for(Future<Integer> result : future) {
			try {
				int value = (int) result.get();
				System.out.println(String.format("Retrieved random number from callable: '%d'", value));
			} catch(InterruptedException | ExecutionException e) {
				System.out.println(String.format("Unable to get result from future "
						+ "due to exception with message '%s'; caused by '%s'",
						e.getMessage(), e.getCause().toString()));
			} 
		}
		
		try {
			service.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
			service.isShutdown();
		} catch(InterruptedException e) {
			System.out.println(String.format("Unable to shutdown ExecutorService "
					+ "due to InterruptedException with message '%s'; caused by '%s'",
					e.getMessage(), e.getCause().toString()));
		}
	}
}