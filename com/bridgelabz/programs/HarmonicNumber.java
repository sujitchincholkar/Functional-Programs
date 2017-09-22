/***********************************************
 * Purpose :This program ​computes​ the​ prime​ factorization​ ​of​ number.​
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		System.out.println(Utility.getHarmonicNumber(number));
	}

}
