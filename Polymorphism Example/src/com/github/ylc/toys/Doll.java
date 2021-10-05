package com.github.ylc.toys;

import com.github.ylc.toy.Product;
import com.github.ylc.toy.Stuffed;

/**
 * A class for storing Doll specific information.
 * 
 * @author 			Yue Chen (yuelchen)
 * @version			1.0.0
 * @since			2020-08-08
 */
public class Doll extends Product implements Stuffed {
	
	/**
	 * Static final class variable for product name.
	 */
	private static final String PRODUCT_NAME = "Party Doll";
	
	//====================================================================================================

	/**
	 * Static class variable which stores the count of Doll objects made since runtime.
	 */
	private static int Total_Doll_Made = 0;
	
	//====================================================================================================
	
	/**
	 * The name of this doll.
	 */
	private String name;
	
	//====================================================================================================
	
	/**
	 * Constructor 
	 * 
	 * Passes final static product name to parent class,
	 * increments the count of Total_Doll_Made class variable,
	 * assigns the passed description to this doll object and 
	 * assigns the price to be 0.0; which means it's free by default.
	 * 
	 * @param description		the description of this doll.
	 */
	public Doll(String description) {
		super(PRODUCT_NAME);
		Total_Doll_Made++;
		
		this.setDescription(description);
		this.setPrice(0.0);		
	}
	
	//====================================================================================================

	/**
	 * Constructor 
	 * 
	 * Passes final static product name to parent class,
	 * increments the count of TOTAL_TOY_UNITS_MADE class variable and
	 * assigns the passed description and price to this doll object.
	 * 
	 * @param description		the description of this doll.
	 * @param price				the price of this doll.
	 */
	public Doll(String description, double price) {
		super(PRODUCT_NAME);
		Total_Doll_Made++;
		
		this.setDescription(description);
		this.setPrice(price);
	}
	
	//====================================================================================================
	
	/**
	 * Returns the total number of Doll objects made since runtime. 
	 * 
	 * @return					the number of Doll objects made since runtime.
	 */
	public static int getTotalDollMade() {
		return Total_Doll_Made;
	}
	
	//====================================================================================================
	
	/**
	 * Sets the name of this doll.
	 * 
	 * @param name				the name of this doll to be set.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the name of this doll.
	 * 
	 * @return					the name of this doll.
	 */
	public String getName() {
		return this.name;
	}
	
	//====================================================================================================
	
	/**
	 * Implementation method of Stuffed interface. 
	 * 
	 * Returns false as Doll is not soft. 
	 */
	@Override
	public boolean isSoft() {
		return false;
	}
	
	//====================================================================================================

	/**
	 * Implementation method of Stuffed interface. 
	 * 
	 * Returns a String value based off the name of this doll.
	 */
	@Override
	public String speak() {
		if(name == null) {
			return String.format("Hello, I am a %s and don't have a friend yet", 
					PRODUCT_NAME);
		} else { 
			return String.format("Hello, I am a %s but my friends call me '%s'", 
					PRODUCT_NAME, this.name);	
		}
	}
	
	//====================================================================================================

	/**
	 * Implementation method of Stuffed interface. 
	 * 
	 * Prints out action when this doll is hugged.
	 */
	@Override
	public void hug() {
		System.out.println("Little tough to squeeze but my inside is soft.");
	}
	
	//====================================================================================================

	/**
	 * Implementation method of Stuffed interface. 
	 * 
	 * Prints out random action when this doll is told to dress up. 
	 */
	@Override
	public void dressUp() {
		//generate random number from 0 - 5
		switch((int) (Math.random() * 5)) {
			case 0:
				System.out.println("Changing into Sailor uniform... "
						+ "Off to sea some dolphins!");
				break;
			case 1:
				System.out.println("Changing into Police officer... "
						+ "Protecting citizens and donuts all around.");
				break;
			case 2: 
				System.out.println("Changing into Nurse... "
						+ "Let me take care of your boo boo.");
				break;
			case 3: 
				System.out.println("Changing into Teacher... "
						+ "Shaping minds and grading papers (maybe with wine).");
				break;
			default:
				System.out.println("Changing... "
						+ "Let's stay casual today and just chill.");
				break;
		}
	}
}