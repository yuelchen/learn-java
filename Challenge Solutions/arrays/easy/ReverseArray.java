/* Name: ReverseArray
 * Date: 2020-12-03
 * 
 * Instructions:
 * Given an array of integers of size N, return a new array of integers in reverse order. 
 * 
 * Source:
 * https://www.hackerrank.com/challenges/arrays-ds/problem
 */

package arrays.easy;

import java.util.Arrays;

public class ReverseArray {
	
	//complete the below method
	public static int[] reverse(int[] a) {
		int[] reversed = new int[a.length];
		
		//add code below this line
		
		int size=a.length-1;
		for(int i=size; i>=0; i--) {
			reversed[size-i] = a[i];
		}
		
		//add code above this time
		
		return reversed;
	}

	public static void main(String[] args) {
		int[] a = new int[]{ 1,2,3,4,5,6,7,8,9 }; 
		System.out.println(Arrays.toString(a));         //prints [1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		int[] reverse = reverse(a);
		System.out.println(Arrays.toString(reverse));   //prints [9, 8, 7, 6, 5, 4, 3, 2, 1]
	}
}
