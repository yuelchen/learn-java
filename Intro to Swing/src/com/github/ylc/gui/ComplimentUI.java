package com.github.ylc.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * A class for loading compliment user interface
 * 
 * @author 			Yue Chen (yuelchen)
 * @version			1.0.0
 * @since			2020-08-08
 */
public class ComplimentUI {

	/**
	 * The JFrame for compliment user interface. 
	 */
	private JFrame frame;
	
	//====================================================================================================
	
	/**
	 * The JLabel for compliment user interface.
	 */
	private JLabel complimentLabel;
	
	//====================================================================================================
	
	/**
	 * The JButton for compliment user interface.
	 */
	private JButton complimentButton;
	
	//====================================================================================================
	
	/**
	 * A list of String values storing compliments that can be displayed.
	 */
	private List<String> compliments;
	
	//====================================================================================================
	
	/**
	 * The index of the currently displayed compliment from compliments list. 
	 */
	private int cacheComplimentIndex;
	
	//====================================================================================================
	
	/**
	 * Constructor
	 * 
	 * Invokes the setJFrame method,
	 * initializes the list of compliments data structure and
	 * sets the cache compliment index to -1 as compliments is an empty list.
	 */
	public ComplimentUI() {
		this.setJFrame();		
		this.compliments = new ArrayList<String>();
		this.cacheComplimentIndex = -1;
	}
	
	//====================================================================================================
	
	/**
	 * Initialize and set JFrame specific variables - makes JFrame close on EXIT.
	 * Initializes JLabel and JButton with default values; 
	 * adds them to the frame. 
	 */
	private void setJFrame() {
		this.frame = new JFrame();
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.complimentLabel = new JLabel("Hey There!",  SwingConstants.CENTER);
		this.frame.getContentPane().add(this.complimentLabel);
		
		this.complimentButton = new JButton("Compliment Me");
		this.complimentButton.addActionListener(new ComplimentListener());
		this.frame.getContentPane().add(BorderLayout.SOUTH, this.complimentButton);
	}
	
	//====================================================================================================
	
	/**
	 * Sets the size for JFrame to be displayed. 
	 * 
	 * @param x					the horizontal length in pixels. 
	 * @param y					the vertical length in pixels.
	 */
	public void display(int x, int y) {
		this.frame.setSize(x, y);
		this.frame.setVisible(true);
	}
	
	//====================================================================================================
	
	/**
	 * Takes the given compliment and adds it to list of compliments. 
	 * 
	 * @param compliment		the compliment to be added to list of compliments. 
	 */
	public void addCompliment(String compliment) {
		this.compliments.add(compliment);
	}
	
	//====================================================================================================
	
	/**
	 * Returns the number of compliments within list of compliments. 
	 * 
	 * @return					the number of compliments within list of compliments. 
	 */
	public int getComplimentsSize() {
		return this.compliments.size();
	}
	
	//====================================================================================================
	
	/**
	 * Inner Class
	 * 
	 * Implements ActionListener for handling when JButton complimentButton is pressed.
	 * 
	 * @author 			Yue Chen
	 * @version			1.0.0
	 * @since			2020-08-08
	 */
	public class ComplimentListener implements ActionListener {
		
		/**
		 * Updates JLabel compliment label with a new compliment from list of 
		 * compliments by random number if size is greater than 0. 
		 * 
		 * If list of compliments is equal (or less) than 0, then set label 
		 * with default notice saying there are no compliments to user. 
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(compliments.size() > 0) {
				cacheComplimentIndex = this.getRandomIndex();
				this.setComplimentLabelText(compliments.get(cacheComplimentIndex)); 
			} else {
				this.setComplimentLabelText("Sorry, no compliments for you :/"); 
			}
		}
		
		//====================================================================================================
		
		/**
		 * Returns a random number within range of compliments list size,
		 * that isn't the same as the previously cached index. 
		 * 
		 * @return					a random number within range of compliments list size. 
		 */
		private int getRandomIndex() {
			int index;
			do {
				index = (int) (Math.random() * compliments.size());
			} while(cacheComplimentIndex == index);
			
			return index;
		}
		
		//====================================================================================================
		
		/**
		 * Sets the compliment label text field to given String text.
		 * @param text				the text to which the compliment label will contain. 
		 */
		private void setComplimentLabelText(String text) {
			complimentLabel.setText("<html><div style='text-align:center;'>" + text + "</div></html>"); 
		}
	} //end of inner class ComplimentListener
}
