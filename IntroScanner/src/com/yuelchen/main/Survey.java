package com.yuelchen.main;

import java.util.Scanner;

public class Survey {
	
	public static void main(String[] args) {
		
		//initialize scanner object for system input (i.e. console).
		Scanner scan = new Scanner(System.in); 
		
		//retrieve values from console user. 
		System.out.print("What is your name? ");
		String name = scan.nextLine();
		
		System.out.print("What's your nickname? ");
		String nickname = scan.next();
		
		System.out.print("true or false, you are a male: ");
		boolean male = scan.nextBoolean();
		
		System.out.print("How old are you? ");
		int age = scan.nextInt();
		
		System.out.print("What's your phone number? ");
		long phoneNumber = scan.nextLong();
		
		System.out.print("What is your monthly salary? ");
		double monthlySalary = scan.nextDouble();
		
		//close scanner.
		scan.close();

		//format description (salary will be formatted to last two decimal spaces). 
		String description = "";
		if(male) {
			description = String.format("Looking for a male named %s (a.k.a. %s), age %d "
					+ "whose currently making %.02f per month; can be reached at phone number %d", 
					name, nickname, age, monthlySalary, phoneNumber);
		} else {
			description = String.format("Looking for a female named %s (a.k.a. %s), age %d "
					+ "whose currently making %.02f per month; can be reached at phone number %d", 
					name, nickname, age, monthlySalary, phoneNumber);
		}
		
		//output description.
		System.out.println(description);
	}
}