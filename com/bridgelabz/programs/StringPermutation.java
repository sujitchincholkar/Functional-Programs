/***********************************************
 * Purpose :This program will print all possible permutations of  string. ​
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StringPermutation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String");
		String word=scanner.next();
		char characters[]=word.toCharArray();
		ArrayList combinations=new ArrayList();
		Utility.stringPermutations(characters, combinations, 0, word.length()-1);
		for(int i=0;i<combinations.size();i++){
			System.out.println(combinations.get(i));
		}
	}

}
