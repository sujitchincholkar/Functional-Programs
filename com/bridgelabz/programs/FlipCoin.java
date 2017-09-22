/***********************************************
 * purpose :This program flips coin n times and prints percetage
 * 			of head and tail
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		int nTimes=Integer.parseInt(args[0]);
		Utility.flipCoin(nTimes);

	}

}
