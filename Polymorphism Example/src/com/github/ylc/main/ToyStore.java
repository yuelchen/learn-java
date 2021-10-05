package com.github.ylc.main;

import java.util.ArrayList;
import java.util.List;
import com.github.ylc.toy.Product;
import com.github.ylc.toys.Doll;
import com.github.ylc.toys.RaceCar;
import com.github.ylc.toys.TeddyBear;

/**
 * An object used to store Toy Store object information, such as products available in inventory.
 * 
 * @author 			Yue Chen (yuelchen)
 * @version			1.0.0
 * @since			2020-08-08
 */
public class ToyStore {

	/**
	 * Stores the name of the toy store - cannot be changed once set.
	 */
	private final String TOY_STORE_NAME;

	//====================================================================================================
	
	/**
	 * A List of Products which will store the toys which are available.
	 */
	private List<Product> toys;

	//====================================================================================================
	
	/**
	 * Constructor 
	 * 
	 * @param name				the final name of the toy store.
	 */
	public ToyStore(String name) {
		this.TOY_STORE_NAME = name;
		this.toys = new ArrayList<Product>();
		
		//invoke private loadToyStore method 
		this.loadToyStore();
	}

	//====================================================================================================
	
	/**
	 * Loads List<Product> toys with a - fixed - starting inventory of newly created object.
	 */
	private void loadToyStore() {
		//load toy store with TeddyBear objects
		this.toys.add(new TeddyBear("Free bear", 0.0));
		this.toys.add(new TeddyBear("Brown Bear", 4.99));
		this.toys.add(new TeddyBear("Black Bear", 5.43));
		this.toys.add(new TeddyBear("Magic Bear", 10.79));
		
		//load toy store with RaceCar objects
		this.toys.add(new RaceCar("Honda Fit - Black", 15.37));
		this.toys.add(new RaceCar("Honda Civic - Orange", 16.10));
		this.toys.add(new RaceCar("Honda Fit - Silver", 11.99));
		this.toys.add(new RaceCar("Toyota Corrolla - Midnight", 11.99));
		this.toys.add(new RaceCar("Jeep Wrangler - Neon Green", 18.55));
		
		//load toy store with Doll objects
		this.toys.add(new Doll("Barbie Doll", 7.95));
		this.toys.add(new Doll("Wooden Doll"));
	}

	//====================================================================================================
	
	/**
	 * Returns the name of the toy store.
	 * 
	 * @return				the name of the toy store.
	 */
	public String getToyStoreName() {
		return this.TOY_STORE_NAME;
	}

	//====================================================================================================
	
	/**
	 * Returns a List containing Product objects representing toys available in the toy store.
	 * 
	 * @return				a List containing Product objects.
	 */
	public List<Product> getToys() {
		return this.toys;
	}

	//====================================================================================================
	
	/**
	 * Returns the number of elements within List of Product objects
	 * 
	 * @return				the number of elements within List.
	 */
	public int getToysAvailable() {
		return this.toys.size();
	}
}