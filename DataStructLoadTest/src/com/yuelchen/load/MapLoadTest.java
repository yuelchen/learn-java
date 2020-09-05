package com.yuelchen.load;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import com.yuelchen.util.Calculate;

public abstract class MapLoadTest {
	
	protected int loadCount = 10000;
	
	protected int threadCount= 5;
	
	protected Map<String, Integer> mapLoad;
	
	protected MapLoadTest(int loadCount, int threadCount) {
		this.loadCount = loadCount;
		this.threadCount = threadCount;
	}
	
	public void runGetLoadResult() {
		try {
			long executorStartTime = System.nanoTime();
			ExecutorService executor = Executors.newFixedThreadPool(threadCount);

			for(int thread = 0; thread < threadCount; thread++) {
				executor.execute(new Runnable() {
					
					public void run() {
						long threadStartTime = System.nanoTime();
						for (int load = 0; load < loadCount; load++) {
							String randomNumber = String.valueOf(
									Math.ceil(Math.random() * loadCount));
							mapLoad.get(randomNumber);
						}
						long threadEndTime = System.nanoTime();
						long difference = Calculate.getDifferenceMilliSeconds(
								threadEndTime, threadStartTime);
						System.out.println(String.format("\t- Thread process completed "
								+ "a load of '%d' get operations in '%d ms'", 
								loadCount, difference));
					}
					
				});
			}
			executor.shutdown();
			executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MINUTES);
			
			long executorEndTime = System.nanoTime();
			long difference = Calculate.getDifferenceMilliSeconds(
					executorEndTime, executorStartTime);
			System.out.println(String.format("Executor terminated for get load of '%d' and "
					+ "'%d' threads in '%d ms'", loadCount, threadCount, difference));
			
		} catch(InterruptedException e) {
			System.out.println(String.format("Unable to complete get load test due to "
					+ "InterruptedException with message '%s'; caused by '%s'", 
					e.getMessage(), e.getCause().toString()));
		}
	}
	
	public void runPutLoadResult() {
		try {
			long executorStartTime = System.nanoTime();
			ExecutorService executor = Executors.newFixedThreadPool(threadCount);

			for(int thread = 0; thread < threadCount; thread++) {
				executor.execute(new Runnable() {
					
					public void run() {
						long threadStartTime = System.nanoTime();
						for (int load = 0; load < loadCount; load++) {
							String randomNumber = String.valueOf(
									Math.ceil(Math.random() * loadCount));
							mapLoad.put(randomNumber, load);
						}
						long threadEndTime = System.nanoTime();
						long difference = Calculate.getDifferenceMilliSeconds(
								threadEndTime, threadStartTime);
						System.out.println(String.format("\t- Thread process completed "
								+ "a load of '%d' get operations in '%d ms'", 
								loadCount, difference));
					}
					
				});
			}
			executor.shutdown();
			executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MINUTES);
			
			long executorEndTime = System.nanoTime();
			long difference = Calculate.getDifferenceMilliSeconds(
					executorEndTime, executorStartTime);
			System.out.println(String.format("Executor terminated for put load of '%d' and "
					+ "'%d' threads in '%d ms'", loadCount, threadCount, difference));
			
		} catch(InterruptedException e) {
			System.out.println(String.format("Unable to complete put load test due to "
					+ "InterruptedException with message '%s'; caused by '%s'",
					e.getMessage(), e.getCause().toString()));
		}
	}
}