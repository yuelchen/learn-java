package com.yuelchen.load;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapLoadTest extends MapLoadTest {
	
	public ConcurrentHashMapLoadTest(int loadCount, int threadCount) {
		super(loadCount, threadCount);
		this.mapLoad = new ConcurrentHashMap<String, Integer>();
	}
}
