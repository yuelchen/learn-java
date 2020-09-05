package com.yuelchen.load;

import java.util.TreeMap;

public class TreeMapLoadTest extends MapLoadTest {
	
	public TreeMapLoadTest(int loadCount, int threadCount) {
		super(loadCount, threadCount);
		this.mapLoad = new TreeMap<String, Integer>();
	}
}
