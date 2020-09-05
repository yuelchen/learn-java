package com.yuelchen.load;

import java.util.Hashtable;

public class HashtableLoadTest extends HashMapLoadTest {

	public HashtableLoadTest(int loadCount, int threadCount) {
		super(loadCount, threadCount);
		this.mapLoad = new Hashtable<String, Integer>();
	}
}