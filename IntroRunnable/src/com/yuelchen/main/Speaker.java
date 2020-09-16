package com.yuelchen.main;

import java.util.ArrayList;
import java.util.List;

public class Speaker {
	
	private static List<String> names = new ArrayList<String>();
	
	public static void main(String[] args) {
		//uncomment the below line if names are passed as arguments
		//names = args; 
		
		//default name is names is empty
		if(names.size() == 0) {
			names.add("Destiny's Child");
		}
		
		System.out.println(String.format("Main thread is '%s' and has '%d' names", 
				Thread.currentThread().getName(), names.size()));
		for(int i = 0; i < names.size(); i++) {
			Thread thread = new Thread(new SayMyName(names.get(i)));
			thread.start();
		}
	}
}
