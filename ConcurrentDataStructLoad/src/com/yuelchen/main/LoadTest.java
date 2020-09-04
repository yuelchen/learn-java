package com.yuelchen.main;

import com.yuelchen.load.ConcurrentHashMapLoadTest;
import com.yuelchen.load.HashMapLoadTest;

public class LoadTest {
	
	private static int DEFAULT_LOAD_SIZE_PER_THREAD = 100000;
	
	private static int DEFAULT_THREAD_SIZE = 5;
	
	public static void main(String[] args) {
		
		System.out.println("HashMap Load Test: ");
		HashMapLoadTest loadTest1 = new HashMapLoadTest(
				DEFAULT_LOAD_SIZE_PER_THREAD, DEFAULT_THREAD_SIZE);
		loadTest1.runPutLoadResult();
		loadTest1.runGetLoadResult();
		

		System.out.println("Concurrent HashMap Load Test: ");
		ConcurrentHashMapLoadTest loadTest2 = new ConcurrentHashMapLoadTest(
				DEFAULT_LOAD_SIZE_PER_THREAD, DEFAULT_THREAD_SIZE);
		loadTest2.runPutLoadResult();
		loadTest2.runGetLoadResult();
	}
}