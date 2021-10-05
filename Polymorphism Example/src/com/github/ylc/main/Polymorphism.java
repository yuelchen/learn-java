package com.github.ylc.main;

import java.util.List;
import com.github.ylc.toy.Product;
import com.github.ylc.toys.Doll;
import com.github.ylc.toys.RaceCar;
import com.github.ylc.toys.TeddyBear;

/** 
 * Polymorphism
 * 
 * The main method class for Polymorphism example.
 * 
 * @author 			Yue Chen (yuelchen)
 * @version			1.0.0
 * @since			2020-08-08
 */

//====================================================================================================

/** 
 * The purpose of this class is to create a ToyStore and print it's contents in order to demonstrate
 * parent and child objects using casting.
 */
public class Polymorphism {

	/**
	 * The main method of HelloWorld.
	 * 
	 * @param args				an array of String values that can be used by main method (not applicable).
	 */
	public static void main(String[] args) {
		//initialize a new ToyStore called "John Doe's Lost & Found"
		ToyStore toyStore = new ToyStore("John Doe's Lost & Found");
		
		//retrieve the inventory size and available toys from ToyStore
		int inventorySize = toyStore.getToysAvailable();
		List<Product> products = toyStore.getToys();
		
		//instantiate a counter variable starting at 1 and iterate through available toys in ToyStore
		int count = 1;
		for(Product product : products) {
			
			//print out available information for each product
			System.out.println(String.format("Product %d out of %d [%s]: "
					+ "Name(%s), Description(%s), Date(%s), Price(%,.2f), isFree? %b", 
					count, inventorySize, product.getClass().toString(), 
					product.getProduct(), product.getDescription(), product.getCreationDate().toString(), 
					product.getPrice(), product.isFree()));
			
			
			//if product is an instance of subclass TeddyBear, print out subclass values
			if(product instanceof TeddyBear) {
				TeddyBear childProduct = (TeddyBear) product;
				System.out.println("\t" + childProduct.speak());
				
				System.out.print("\t");
				childProduct.dressUp();				
				System.out.println();
			} 
			
			//if product is an instance of subclass RaceCar, print out subclass values
			if(product instanceof RaceCar) {
				RaceCar childProduct = (RaceCar) product;
				
				System.out.print("\t Engine Revving: ");
				childProduct.play();
				
				System.out.print("\t Drifting: ");
				childProduct.drift();
				System.out.println();
			}
			
			//if product is an instance of subclass Doll, print out subclass values
			if(product instanceof Doll) {
				Doll childProduct = (Doll) product;
				System.out.println("\t" + childProduct.speak());
				
				System.out.print("\t");
				childProduct.dressUp();	
				System.out.println();
			} 
			
			//increment counter variable for next iteration
			count++;
		}
		
		//print summary of inventory stock for ToyStore 
		System.out.println(String.format("There has been %d products made since opening %s", 
				Product.getTotalToyUnitsMade(), toyStore.getToyStoreName()));		
		
		System.out.println(String.format("Of %d total products made since opening, %d were TeddyBears", 
				Product.getTotalToyUnitsMade(), TeddyBear.getTotalTeddyBearMade()));
		
		System.out.println(String.format("Of %d total products made since opening, %d were Race Cars", 
				Product.getTotalToyUnitsMade(), RaceCar.getTotalCarsMade()));
		
		System.out.println(String.format("Of %d total products made since opening, %d were Dolls", 
				Product.getTotalToyUnitsMade(), Doll.getTotalDollMade()));
	}
}