package com.yuelchen.main;

public class SayMyName implements Runnable {
	
	private String name;
	
	private int numberOfTimes;
	
	public SayMyName(String name) {
		this.name = name;
		this.numberOfTimes = 43; 
	}
	
	public SayMyName(String name, int times) {
		this.name = name;
		this.numberOfTimes = times;
	}

	@Override
	public void run() {
		for(int i = 0; i < this.numberOfTimes; i++) {
			System.out.println(String.format("Say my name: %s", name));
		}
	}
}