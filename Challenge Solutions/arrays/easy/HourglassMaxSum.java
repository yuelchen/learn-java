/* Name: ReverseArray
 * Date: 2020-12-03
 * 
 * Instructions:
 * Given a 6x6 2D array of integers, return the max sum of array indexes in shape of an hour glass; input will always be 6x6.
 * 
 * Source:
 * https://www.hackerrank.com/challenges/2d-array/problem
 */

package arrays.easy;

import java.util.Arrays;

public class HourglassMaxSum {
	
	public static int getMaxSum(int[][] a) {
		int maxSum = Integer.MIN_VALUE;
		
		//add code below this line
		
		for(int y=0; y<a.length-2; y++) {
			int[] b = a[y];
			for(int x=0; x<b.length-2; x++) {
				
				int topLeft 	= a[y][x];
				int top			= a[y][x+1];
				int topRight	= a[y][x+2];
				int center 		= a[y+1][x+1];
				int botLeft 	= a[y+2][x];
				int bot			= a[y+2][x+1];
				int botRight	= a[y+2][x+2];
				
				int hourglassSum = topLeft + top + topRight + center + botLeft + bot + botRight;
				maxSum = maxSum < hourglassSum ? hourglassSum : maxSum;
			}
		}
		
		//add code above this time
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		int[][] a = new int[][] { 
			{ 1, 1, 1, 0, 0, 0 },
			{ 0, 1, 0, 0, 0, 0 },
			{ 1, 1, 1, 0, 0, 0 },
			{ 0, 0, 2, 4, 4, 0 },
			{ 0, 0, 0, 2, 0, 0 },
			{ 0, 0, 1, 2, 4, 0 }
		};
		System.out.println(Arrays.deepToString(a));
		
		int maxSum = getMaxSum(a);
		System.out.println(String.format("The max hourglass sum for given array is %d", maxSum)); //should print 19
	}
}