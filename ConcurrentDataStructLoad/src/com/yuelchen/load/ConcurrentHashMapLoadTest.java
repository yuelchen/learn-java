package com.yuelchen.load;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import com.yuelchen.util.Calculate;

public class ConcurrentHashMapLoadTest extends DataStructureLoadTest {

	public Map<String, Integer> mapLoad;
	
	public ConcurrentHashMapLoadTest(int loadCount, int threadCount) {
		this.mapLoad = new ConcurrentHashMap<String, Integer>();
		this.loadCount = loadCount;
		this.threadCount = threadCount;		
	}

	@Override
	public void runGetLoadResult() {
		
		try {
			long executorStartTime = System.nanoTime();
			ExecutorService executor = Executors.newFixedThreadPool(this.threadCount);

			for(int thread = 0; thread < this.threadCount; thread++) {
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
			System.out.println(String.format("[ConcurrentHashMapLoadTest] runPutLoadResult - "
					+ "Executor completed with load of '%d' and '%d' threads in '%d ms'", 
					this.loadCount, this.threadCount, difference));
			
		} catch(InterruptedException e) {
			System.out.println(String.format("[ConcurrentHashMapLoadTest] runGetLoadResult - "
					+ "Unable to complete load test due to InterruptedException with message "
					+ "'%s'; caused by '%s'", e.getMessage(), e.getCause().toString()));
		}
		
	}

	@Override
	public void runPutLoadResult() {
		try {
			long executorStartTime = System.nanoTime();
			ExecutorService executor = Executors.newFixedThreadPool(this.threadCount);

			for(int thread = 0; thread < this.threadCount; thread++) {
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
			System.out.println(String.format("[ConcurrentHashMapLoadTest] runPutLoadResult - "
					+ "Executor completed with load of '%d' and '%d' threads in '%d ms'", 
					this.loadCount, this.threadCount, difference));
			
		} catch(InterruptedException e) {
			System.out.println(String.format("[ConcurrentHashMapLoadTest] runPutLoadResult - "
					+ "Unable to complete load test due to InterruptedException with message "
					+ "'%s'; caused by '%s'", e.getMessage(), e.getCause().toString()));
		}
	}
}
