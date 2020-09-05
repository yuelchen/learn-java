package com.yuelchen.load;

import java.util.HashMap;

public class HashMapLoadTest extends MapLoadTest {
	
	public HashMapLoadTest(int loadCount, int threadCount) {
		super(loadCount, threadCount);
		this.mapLoad = new HashMap<String, Integer>();		
	}	
}
