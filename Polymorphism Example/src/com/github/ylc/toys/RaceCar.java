package com.github.ylc.toys;

import com.github.ylc.toy.Product;

/**
 * A class for storing RaceCar specific information.
 * 
 * @author 			Yue Chen (yuelchen)
 * @version			1.0.0
 * @since			2020-08-08
 */
public class RaceCar extends Product {

	/**
	 * Static final class variable for product name.
	 */
	private static final String PRODUCT_NAME = "Race Car";
	
	//====================================================================================================
	
	/**
	 * Static class variable which stores the count of RaceCar objects made since runtime.
	 */
	private static int TOTAL_RACE_CARS_MADE = 0;
	
	//====================================================================================================
	
	/**
	 * Constructor 
	 * 
	 * Passes final static product name to parent class,
	 * increments the count of TOTAL_RACE_CARS_MADE class variable,
	 * assigns the passed description to this race car object and 
	 * assigns the price to be 0.0; which means it's free by default.
	 * 
	 * @param description		the description of this race car.
	 */
	public RaceCar(String description) {
		super(PRODUCT_NAME);
		TOTAL_RACE_CARS_MADE++;
		
		this.setDescription(description);
		this.setPrice(0.0);
	}
	
	//====================================================================================================
	
	/**
	 * Constructor 
	 * 
	 * Passes final static product name to parent class,
	 * increments the count of TOTAL_RACE_CARS_MADE class variable and
	 * assigns the passed description and price to this race car object.
	 * 
	 * @param description		the description of this race car.
	 * @param price				the price of this race car.
	 */
	public RaceCar(String description, double price) {
		super(PRODUCT_NAME);
		TOTAL_RACE_CARS_MADE++;
		
		this.setDescription(description);
		this.setPrice(price);
	}
	
	//====================================================================================================
	
	/**
	 * Returns the total number of RaceCar objects made since runtime. 
	 * 
	 * @return					the number of RaceCar objects made since runtime.
	 */
	public static int getTotalCarsMade() {
		return TOTAL_RACE_CARS_MADE;
	}
	
	//====================================================================================================
	
	/**
	 * Prints out sound fx when playing with race car object.
	 */
	public void play() {
		System.out.println("Vroom Vroom, Let's Race!");
	}
	
	//====================================================================================================
	
	/**
	 * Prints out drifting sound fx when drifting with race car object
	 */
	public void drift() {
		System.out.println("Screeeeeech!");
	}
}