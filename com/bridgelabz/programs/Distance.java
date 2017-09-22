/***********************************************
 * Purpose :This program will find distance between x and y.​
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		System.out.println(Utility.getDistance(x, y));
	}

}
