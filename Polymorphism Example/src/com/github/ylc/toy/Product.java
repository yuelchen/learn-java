package com.github.ylc.toy;

import java.util.Date;

/**
 * An abstract class for representing all toy products in Toy Store.
 * 
 * @author 			Yue Chen (yuelchen)
 * @version			1.0.0
 * @since			2020-08-08
 */

public abstract class Product {

	/**
	 * Static class variable which stores the count of Product objects made since runtime.
	 */
	private static int TOTAL_TOY_UNITS_MADE = 0;
	
	//====================================================================================================
	
	/**
	 * The date of when product was created.
	 */
	private final Date CREATION_DATE;
	
	//====================================================================================================
	
	/**
	 * The name of the product.
	 */
	private String product;
	
	//====================================================================================================
	
	/**
	 * The description of the product.
	 */
	private String description;
	
	//====================================================================================================
	
	/**
	 * The price of the product.
	 */
	private double price;
	
	//====================================================================================================
	
	/**
	 * Constructor 
	 * 
	 * Protected access modifier - only children classes of this class may use constructor.
	 * i.e. super("product name") within children class constructor
	 * 
	 * Increments the count of TOTAL_TOY_UNITS_MADE class variable 
	 * and sets the products creation date. 
	 * 
	 * @param product			the name of the product.
	 */
	protected Product(String product) {
		TOTAL_TOY_UNITS_MADE++;
		this.CREATION_DATE = new Date();
		
		this.product = product;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the count of products made since runtime. 
	 * 
	 * @return					the count of products created since runtime.
	 */
	public static int getTotalToyUnitsMade() {
		return TOTAL_TOY_UNITS_MADE;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the creation date for this product. 
	 * 	
	 * @return					the creation date for this product.
	 */
	public Date getCreationDate() {
		return this.CREATION_DATE;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the name of this product.
	 * 
	 * @return					the name of this product.
	 */
	public String getProduct() {
		return this.product;
	}
	
	//====================================================================================================
	
	/**
	 * Sets the description of this product. 
	 * 
	 * @param desc				the description of this product to be set.
	 */
	protected void setDescription(String desc) {
		this.description = desc;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the description of this product. 
	 * 
	 * @return					the description of this product. 
	 */
	public String getDescription() {
		return this.description;
	}
	
	//====================================================================================================
	
	/**
	 * Sets the price of this product. 
	 * 
	 * @param cost				the price of this product to be set.
	 */
	protected void setPrice(double cost) {
		this.price = cost;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the price of this product.
	 * 
	 * @return					the price of this product.
	 */
	public double getPrice() {
		return this.price;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the boolean value for if this product is free based off the price. 
	 * 
	 * @return					true if the price is less than or equal to 0.0, 
	 * 							false if the price is greater than 0.0.
	 */
	public boolean isFree() {
		return this.price == 0.0 ? true : false;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the boolean value for if a product is free based off the cost. 
	 * 
	 * @param cost				The value which will be used to determine if a product is free. 
	 * @return					true if the cost is less than or equal to 0.0, 
	 * 							false if the cost is greater than 0.0.
	 */
	public boolean isFree(double cost) {
		return cost <= 0.0 ? true : false;
	}
}