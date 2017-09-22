/***********************************************
 * purpose :This program prints Hello with entered name
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrintName {
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scanner.nextLine();
		Utility.printName(name);
	}
}
