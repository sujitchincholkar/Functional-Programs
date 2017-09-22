/***********************************************
 * Purpose :​
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		int stake=Integer.parseInt(args[0]);
		int goal=Integer.parseInt(args[1]);
		int trials=Integer.parseInt(args[2]);
		Utility.gamblerSimulator(stake, goal, trials);
	}

}
