package com.github.ylc.main;

import com.github.ylc.gui.ComplimentUI;

/** 
 * UserInterface
 * 
 * The main method class for graphic user interface example.
 * 
 * @author 			Yue Chen (yuelchen)
 * @version			1.0.0
 * @since			2020-08-08
 */
public class UserInterface {
	
	/**
	 * The main method of UserInterface.
	 * 
	 * @param args				an array of String values that can be used by main method (not applicable).
	 */
	public static void main(String[] args) {
		ComplimentUI complimenter = new ComplimentUI();
		complimenter.addCompliment("On a scale from 1 to 10, you're an 11!");
		complimenter.addCompliment("You're like a ray of sunshine on a really dreary day.");
		complimenter.addCompliment("You are the most perfect you there is.");
		complimenter.display(300, 300);
	}
}