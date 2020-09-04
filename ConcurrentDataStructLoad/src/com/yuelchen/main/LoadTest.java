package com.yuelchen.main;

import com.yuelchen.kiad.HashMapLoadTest;

public class LoadTest {
	public static void main(String[] args) {
		HashMapLoadTest hashMapTest = new HashMapLoadTest(100000, 5);
		hashMapTest.runPutLoadResult();
		hashMapTest.runGetLoadResult();
	}
}