/***********************************************
 * Purpose :This  program will find distinct triplets whose sum is zero.​
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SumOfThree {
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		int array[]=new int[9];
		for(int i=0;i<array.length;i++){
			array[i]=scanner.nextInt();
		}
		Utility.findDistinctTriplets(array);
	}
}
