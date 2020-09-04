package com.yuelchen.load;

public abstract class DataStructureLoadTest {
	
	protected int loadCount = 100000;
	
	protected int threadCount = 5;
	
	public abstract void runGetLoadResult();
	
	public abstract void runPutLoadResult();
}