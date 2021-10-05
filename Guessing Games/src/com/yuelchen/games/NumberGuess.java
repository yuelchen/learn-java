package com.yuelchen.games;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * NumberGuess is a guessing game based off a random number; just as the name describes. 
 * 
 * The player will be prompted to enter a min and max integer which the system will
 * use to generate a random number.
 * 
 * The difference between the min and max number cannot be smaller than 10.
 * 
 * Once the system has generated a random number, the player will be allowed to guess.
 * 
 * Each time a player guesses, the system will return 1 of 3 responses:
 *  - Lower (guess number is higher than random number).
 *  - Higher (guess number is lower than random number).
 *  - Correct (guess number is equal to random number).
 * 
 * @author 	yuelchen
 * @version	1.0.0
 * @since 	2020-08-26
 */
public class NumberGuess {
	
	/**
	 * Starts a new game for number guessing game. 
	 */
	public static void newGame(Scanner scan) {
		int min = getMin(scan);
		int max = getMax(scan, min);
		int random = getRandomNumber(scan, min, max);
		
		int turns = playGame(scan, min, max, random);
		System.out.println(String.format("Correct! It took you '%d' turns to guess '%d'\n",
				turns, random));
	}
	
	//====================================================================================================
	
	/**
	 * Retrieved a minimum value of type integer. 
	 * Will continue to ask until a valid response is given by user. 
	 * 
	 * @param scan			scanner object used to retrieve response from player. 
	 * 
	 * @return				a minimum value to be used for generating random number.
	 */
	private static int getMin(Scanner scan) {
		do {
			try {
				System.out.print("Enter a min value: ");
				return scan.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("The min value must be an integer, please try again...");
			}
		} while(true);
	}
	
	//====================================================================================================
	
	/**
	 * Retrieved a maximum value of type integer. 
	 * Will continue to ask until a valid response is given by user. 
	 * 
	 * @param scan			scanner object used to retrieve response from player.
	 * @param min			the minimum value that is used to verify that maximum value
	 * 						is greater than minimum by at least a value of 10. 
	 * 
	 * @return				a maximum value to be used for generating random number. 
	 */
	private static int getMax(Scanner scan, int min) {
		do {
			try {
				System.out.print("Enter a min value: ");
				int proposedMax = scan.nextInt();
				
				if(proposedMax >= (min + 10)) {
					return proposedMax;
				} else {
					System.out.println("The max value must be greater than min by a value of 10");
				}
				
			} catch(InputMismatchException e) {
				System.out.println("The min value must be an integer, please try again...");
			}
		} while(true);
	}
	
	//====================================================================================================
	
	/**
	 * Returns a random number between given min and max - inclusively. 
	 * 
	 * Example: 
	 *  - min(0) and max(5)
	 *  - random number can be 0, 5 or any number in between. 
	 * 
	 * @param scan			scanner object used to retrieve response from player.
	 * @param min			the minimum value to be used for generating random number.
	 * @param max			the maximum value to be used for generating random number.
	 * 
	 * @return				a random number between given min and max - inclusively. 
	 */
	private static int getRandomNumber(Scanner scan, int min, int max) {
		Random random = new Random();
		return random.nextInt((max + 1) - min) + min;
	}
	
	//====================================================================================================
	
	/**
	 * Return the number of turns it took the player to guess the random number. 
	 * 
	 * @param scan			scanner object used to retrieve response from player.
	 * @param min			the minimum value to be used for generating random number.
	 * @param max			the maximum value to be used for generating random number.
	 * @param random		the random number generated between min and max - inclusively. 
	 * 
	 * @return				the number of turns it took the player to guess the random number. 
	 */
	private static int playGame(Scanner scan, int min, int max, int random) {
		int turns = 0;
		do {
			int answer = getAnswer(scan, min, max);
			turns++;
			
			if(answer > random) {
				System.out.println(String.format("Lower than %s; try again...", answer));
			} else if(answer < random) {
				System.out.println(String.format("Higher than %s; try again...", answer));
			} else {
				return turns;
			}		
		} while(true);
	}
	
	//====================================================================================================
	
	/**
	 * Returns an answer of type integer given by user; their guess. 
	 * Will continue to ask until a valid response is given by user. 
	 * 
	 * @param scan			scanner object used to retrieve response from player.
	 * @param min			the minimum value to be used for generating random number.
	 * @param max			the maximum value to be used for generating random number.
	 * 
	 * @return				an answer of type integer given by user. 
	 */
	private static int getAnswer(Scanner scan, int min, int max) {
		try {
			System.out.print(String.format("What number am I ['%d' - '%d']? ", min, max));
			return scan.nextInt();
		} catch(InputMismatchException e) {
			System.out.println(String.format("The answer must be an integer inclusively between "
					+ "'%d' - '%d'", min, max));
			return getAnswer(scan, min, max);
		}
	}
}