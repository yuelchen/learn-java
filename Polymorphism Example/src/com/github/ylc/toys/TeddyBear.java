package com.github.ylc.toys;

import com.github.ylc.toy.Stuffed;
import com.github.ylc.toy.Product;

/**
 * A class for storing TeddyBear specific information.
 * 
 * @author 			Yue Chen (yuelchen)
 * @version			1.0.0
 * @since			2020-08-08
 */
public class TeddyBear extends Product implements Stuffed {

	/**
	 * Static final class variable for product name.
	 */
	private static final String PRODUCT_NAME = "Teddy Bear";
	
	//====================================================================================================

	/**
	 * Static class variable which stores the count of TeddyBear objects made since runtime.
	 */
	private static int TOTAL_TEDDY_BEAR_MADE = 0;
	
	//====================================================================================================
	
	/**
	 * The name of this teddy bear.
	 */
	private String name;
	
	//====================================================================================================
	
	/**
	 * Constructor 
	 * 
	 * Passes final static product name to parent class,
	 * increments the count of TOTAL_TEDDY_BEAR_MADE class variable,
	 * assigns the passed description to this teddy bear object and 
	 * assigns the price to be 0.0; which means it's free by default.
	 * 
	 * @param description		the description of this teddy bear.
	 */
	public TeddyBear(String description) {
		super(PRODUCT_NAME);
		TOTAL_TEDDY_BEAR_MADE++;
		
		this.setDescription(description);
		this.setPrice(0.0);		
	}
	
	//====================================================================================================
	
	/**
	 * Constructor 
	 * 
	 * Passes final static product name to parent class,
	 * increments the count of TOTAL_TEDDY_BEAR_MADE class variable and
	 * assigns the passed description and price to this teddy bear object.
	 * 
	 * @param description		the description of this teddy bear.
	 * @param price				the price of this teddy bear.
	 */
	public TeddyBear(String description, double price) {
		super(PRODUCT_NAME);
		TOTAL_TEDDY_BEAR_MADE++;
		
		this.setDescription(description);
		this.setPrice(price);
	}
	
	//====================================================================================================
	
	/**
	 * Returns the total number of TeddyBear objects made since runtime. 
	 * 
	 * @return					the number of TeddyBear objects made since runtime.
	 */
	public static int getTotalTeddyBearMade() {
		return TOTAL_TEDDY_BEAR_MADE;
	}
	
	//====================================================================================================
	
	/**
	 * Sets the name of this teddy bear.
	 * 
	 * @param name				the name of this teddy bear to be set.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	//====================================================================================================

	/**
	 * Returns the name of this teddy bear.
	 * 
	 * @return					the name of this teddy bear.
	 */
	public String getName() {
		return this.name;
	}
	
	//====================================================================================================
	
	/**
	 * Implementation method of Stuffed interface. 
	 * 
	 * Returns true as TeddyBear is not soft. 
	 */
	@Override
	public boolean isSoft() {
		return true;
	}
	
	//====================================================================================================

	/**
	 * Implementation method of Stuffed interface. 
	 * 
	 * Returns a String value based off the name of this teddy bear.
	 */
	@Override
	public String speak() {
		if(name == null) {
			return String.format("Hello, I am a %s and have yet to find an owner", 
					PRODUCT_NAME);
		} else { 
			return String.format("Hello, I am a %s but you can call me '%s'", 
					PRODUCT_NAME, this.name);	
		}
	}
	
	//====================================================================================================

	/**
	 * Implementation method of Stuffed interface. 
	 * 
	 * Prints out action when this teddy bear is hugged.
	 */
	@Override
	public void hug() {
		System.out.println("Play teddy bear being squeezed sound here");
	}
	
	//====================================================================================================

	/**
	 * Implementation method of Stuffed interface. 
	 * 
	 * Prints out random action when this teddy bear is told to dress up. 
	 */
	@Override
	public void dressUp() {
		//generate random number from 0 - 5
		switch((int) (Math.random() * 5)) {
			case 0:
				System.out.println("Changing... Who say's bears can't wear dresses?! mwahhh<3");
				break;
			case 1:
				System.out.println("Changing... Let's wear something casual, only a T-shirt (no pants).");
				break;
			case 2: 
				System.out.println("Changing... Let's only wear pants, nipples need to breathe!");
				break;
			case 3: 
				System.out.println("Changing... Clubbing time! or is a tuxedo too much?");
				break;
			default:
				System.out.println("Changing... I don't feel like getting dressed again; staying all natural.");
				break;
		}
	}
}
