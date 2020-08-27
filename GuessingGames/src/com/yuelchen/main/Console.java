package com.yuelchen.main;

import java.util.Scanner;

import com.yuelchen.games.NumberGuess;

public class Console {
	public static void main(String[] args) {
		System.out.println("Welcome to Console games!\n");
		Scanner scan = new Scanner(System.in);
		
		boolean keepPlaying = true;
		do {
			System.out.println("Please select from the below menu:");
			System.out.println("[0] Exit and Shutdown*");
			System.out.println("[1] Guess That Number");
			
			System.out.print("What would you like to do? ");
			String input = scan.next();
			
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
			
		} while(keepPlaying);
		
		scan.close();
		System.out.println("Shutting down Console games!");
	}
}