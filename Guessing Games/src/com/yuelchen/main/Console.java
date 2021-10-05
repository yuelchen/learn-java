package com.yuelchen.main;

import java.util.Scanner;

import com.yuelchen.games.NumberGuess;

/**
 * Console is a main method class for demonstrating simple use-case for Java Scanner.
 * 
 * @author 	yuelchen
 * @version	1.0.0
 * @since 	2020-08-26
 */
public class Console {
	
	/**
	 * The main method. 
	 * 
	 * @param args					an array of Strings as main method arguments.
	 */
	public static void main(String[] args) {
		
		System.out.println("Welcome to Console games!\n");
		Scanner scan = new Scanner(System.in);
		
		boolean keepPlaying = true;
		do {
			//print menu
			System.out.println("Please select from the below menu:");
			System.out.println("[0] Exit and Shutdown*");
			System.out.println("[1] Guess That Number");
			
			//ask user for choice
			System.out.print("What would you like to do? ");
			String input = scan.next();
			
			//determine action based off input
			switch(input) {
				case "0": 
					keepPlaying = false;
					break;
				case "1": 
					NumberGuess.newGame(scan);
					break;
				default:
					System.out.println(String.format("Input '%s' is not valid, "
							+ "please try again...", input));
					break;
			}
			
		} while(keepPlaying); //exits only when '0' is entered
		
		scan.close();
		System.out.println("Shutting down Console games!");
	}
}