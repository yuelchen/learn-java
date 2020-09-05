package com.yuelchen.util;

public class Calculate {
	
	public static long getDifferenceSeconds(long endTimeNanoSec, long startTimeNanoSec) {
		return getDifferenceMilliSeconds(endTimeNanoSec, startTimeNanoSec) / 1000;
	}
	
	public static long getDifferenceMilliSeconds(long endTimeNanoSec, long startTimeNanoSec) {
		return getDifferenceMicroSeconds(endTimeNanoSec, startTimeNanoSec) / 1000;
	}
	
	public static long getDifferenceMicroSeconds(long endTimeNanoSec, long startTimeNanoSec) {
		return getDifferenceNanoSeconds(endTimeNanoSec, startTimeNanoSec) / 1000;
	}
	
	public static long getDifferenceNanoSeconds(long endTimeNanoSec, long startTimeNanoSec) {
		return endTimeNanoSec - startTimeNanoSec;
	}
}