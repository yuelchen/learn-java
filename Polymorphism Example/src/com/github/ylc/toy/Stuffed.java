package com.github.ylc.toy;

/**
 * A interface for toys that are stuffed.
 * 
 * @author 			Yue Chen (yuelchen)
 * @version			1.0.0
 * @since			2020-08-08
 */
public interface Stuffed {
	
	/**
	 * Returns if Class which implements Stuffed is soft or not.
	 * 
	 * @return				true if it is soft, false if it is not soft.
	 */
	public boolean isSoft();
	
	//====================================================================================================

	/**
	 * Returns a phrase that a stuffed object can say.
	 * 
	 * @return				a phrase that a stuffed object can say.
	 */
	public String speak();
	
	//====================================================================================================

	/**
	 * A method which does something when given a hug.
	 */
	public void hug();
	
	//====================================================================================================

	/**
	 * A method which does something when told to dress up. 
	 */
	public void dressUp();
	
}
