package com.yuelchen.main;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {		
		
		//creates a list for storing String
		List<String> listOfStrings = new ArrayList<String>();
		System.out.println("Created new List of Strings: " + listOfStrings);
		
		//add String values to list
		listOfStrings.add("Hello");
		listOfStrings.add("World");
		listOfStrings.add("John Doe");
		listOfStrings.add("Jane Doe");
		System.out.println("Added values to List of Strings: " + listOfStrings);
		
		//get index of String value; if it doesn't exist, returns -1
		int worldIndex = listOfStrings.indexOf("World");
		System.out.println("Retrieved 'World' from List at index " + worldIndex);
		
		//removes String value at given index
		listOfStrings.remove(worldIndex);
		System.out.println("Removed values from List of Strings: " + listOfStrings);
		
		//clears list of all values
		listOfStrings.clear();
		System.out.println("Cleared all Strings from List: " + listOfStrings);
	}
}