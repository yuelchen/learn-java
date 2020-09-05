package com.yuelchen.load;

import java.util.LinkedHashMap;

public class LinkedHashMapLoadTest extends MapLoadTest{

	public LinkedHashMapLoadTest(int loadCount, int threadCount) {
		super(loadCount, threadCount);
		this.mapLoad = new LinkedHashMap<String, Integer>();
	}
}
