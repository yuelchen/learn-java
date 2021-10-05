package com.github.ylc.main;

import java.util.Scanner;

/**
 * HelloWorld
 * 
 * The "Hello World!" generally the first programming project for beginners learning to write code. 
 * Your typical "Hello World!" application will typically print out the text onto the screen (i.e. console or terminal). 
 * 
 * @author 			Yue Chen (yuelchen)
 * @version			1.0.0
 * @since			2020-08-08
 */

//====================================================================================================

/** 
 * The purpose of this class is to print Hello World to the console.
 */
public class HelloWorld {
	
	/**
	 * Private constructor
	 */
	private HelloWorld() {} 
	
	/**
	 * The main method of HelloWorld.
	 * 
	 * @param args		an array of String values that can be used by main method (not applicable).
	 */
	public static void main(String[] args) {
		
		//system output
		System.out.println("Hello World! ");
		System.out.print("What is your name? ");
		
		//instantiate Scanner Class from java.util library
		Scanner scan = new Scanner(System.in);
		
		//user input into system stored in variable named 'input'
		String input = scan.nextLine();
		scan.close();
		
		//system output with user input
		System.out.println();
		System.out.println(String.format("Ah, it's a pleasure to meet you, %s!", input));
		System.out.println("You may address me as System.");
	}
}