/***********************************************
 * purpose : To store all logic of the programs
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.utility;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author bridgeit
 *
 */
public class Utility {
	static Scanner scanner = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(
			new OutputStreamWriter(System.out), true);
	
	/**
	 * This method prints given name 
	 * with template Hello name ,How are you?
	 * @param name -name to be print
	 */
	public static void printName(String name) {
		String message="Hello​ ​ <<UserName>> ,​ How​ ​ are​ ​ you?";
		Pattern pattern=Pattern.compile("<<UserName>>");
		Matcher matcher=pattern.matcher(message);
		message=matcher.replaceFirst(name);
		if (name.length() > 3) {
			System.out.println(message);
		} else {
			System.out.println("Inavalid Name");
		}
	}

	/**This method randomly generate Head an Tail
	 * and calculate their percentage and prints it.
	 * 
	 * @param noOftimes -number of times coin to be flip
	 */
	public static void flipCoin(int noOftimes) {
		int countHead = 0, countTail = 0;
		float percentH, percentT;
		for (int i = 0; i < noOftimes; i++) {
			if (Math.random() < 0.5) {
				System.out.println("Head");
				countHead++;
			} else {
				System.out.println("Tail");
				countTail++;
			}
		}
		// Calculating percentage
		percentH = (countHead * 100) / noOftimes;
		percentT = (countTail * 100) / noOftimes;
		System.out.println("Percentage of Tail=" + percentT
				+ "\nPercentage of Head=" + percentH);
	}

	/**This method checks if given year is leap 
	 * year or not
	 * @param year
	 * @return returns true if year is leap else return false
	 */
	public static boolean isLeapYear(int year) {
		boolean isLeapYear;
		// divisible by 4
		isLeapYear = (year % 4 == 0);
		// divisible by 4 and not by 100
		isLeapYear = isLeapYear && (year % 100) != 0;
		// divisible by 4 and 400
		isLeapYear = isLeapYear || (year % 400) == 0;
		return isLeapYear;

	}
	
	/**This method prints power of two of each
	 * from 0 to given number 
	 * @param number -number upto which power of two will get printed
	 * 
	 */
	public static void printPowerOfTwo(int number) {
		double ans;
		for (int power = 0; power <= number; power++) {
			ans = Math.pow(2, power);
			System.out.println(power + " " + ans);
		}
	}

	/**This method return harmonic series upto given number
	 * @param number -position upto which you want harmonic series
	 * @return
	 * retruns harmonic number genrated by harmonic series
	 */
	public static double getHarmonicNumber(int number) {
		double hNumber = 0.0;
		for (float i = 1; i <= number; i++) {
			hNumber += (1 / i);
		}
		return hNumber;
	}

	/**This method simulates gambler.It prints percentage of win and loss
	 * @param stake -Initial amount
	 * @param goal  -Amount you want to win
	 * @param trials -Number of tries
	 */
	public static void gamblerSimulator(int stake, int goal, int trials) {
		int wins = 0;

		for (int t = 0; t < trials; t++) {
			int cash = stake;
			while (cash > 0 && cash < goal) {
				
				if (Math.random() < 0.5)
					cash++;
				else
					cash--;
			}
			if (cash == goal)
				wins++;
		}
		// print results
		System.out.println(wins + " wins out of " + trials);
		System.out.println("Percent of games won = " + 100.0 * wins / trials);

	}

	/**This method generates and prints N distinct random Coupons
	 * @param numberOfRandoms -number of randoms to generate
	 */
	public static void generateCoupon(int numberOfRandoms) {
		int randomCount = 1, randomNo, flag = 0, index = 1;
		int arrayOfRandoms[] = new int[numberOfRandoms];
		arrayOfRandoms[0] = (int) (numberOfRandoms * Math.random());
		while (index < numberOfRandoms) {
			randomNo = (int) (Math.random() * numberOfRandoms);
			randomCount++;
			for (int j = 0; j < index; j++) {
				if (arrayOfRandoms[j] == randomNo) {
					flag = 1;
				}
			}
			if (flag == 0) {
				arrayOfRandoms[index] = randomNo;
				index++;
			}
			flag = 0;
		}
		System.out.println(randomCount);
		for (int i : arrayOfRandoms) {
			System.out.println(i);
		}

	}

	/**This method prints prime factors of given number
	 * @param number
	 */
	public static void printPrimeFactors(int number) {
		for (int factor = 2; factor * factor <= number; factor++) {
			// if factor is a factor of n, repeatedly divide it out
			while (number % factor == 0) {
				System.out.print(factor + " ");
				number = number / factor;
			}
		}
		// if biggest factor occurs only once, n > 1
		if (number > 1)
			System.out.println(number);
		else
			System.out.println();
	}

	/**This method calculates distance from xPoint to yPoint
	 * @param xPoint -Point x
	 * @param yPoint -Point y 
	 * @return returns distance
	 */
	public static double getDistance(int xPoint, int yPoint) {
		double distance = Math.sqrt(Math.pow(xPoint, 2) + Math.pow(yPoint, 2));
		return distance;
	}

	/**This method prints quadriatic roots 
	 * @param aValue 
	 * @param bValue
	 * @param cValue
	 */
	public static void printQuadriaticRoots(int aValue, int bValue, int cValue) {
		double delta = bValue * bValue - 4 * aValue * cValue;
		if (delta > 0) {
			double sqroot = Math.sqrt(delta);
			double root1 = (-bValue + sqroot) / (2.0 * aValue);
			double root2 = (-bValue - sqroot) / (2.0 * aValue);

			System.out.println(root1);
			System.out.println(root2);
		} else {
			System.out.println("Roots are imaginary");
		}
	}

	/**This method calculates windchill.
	 * @param temprature -temperature of wind 
	 * @param windspeed	 -Velocity of wind
	 * @return returns windchill
	 * 
	 */
	public static double getWindChill(double temprature, double windspeed) {
		double windChill;
		windChill = 35.74 + 0.6215 * temprature + (0.4275 * temprature - 35.75)
				* Math.pow(windspeed, 0.16);
		return windChill;
	}

	/**This method reads integer array from user and print it
	 * @param array -Array to read values in
	 * @param rows	-Number of rows
	 * @param cols	-Number of columns
	 */
	public static void getArray(int array[][], int rows, int cols) {
		System.out.println("Enter Array elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		printArray(array, rows, cols);

	}
	/**This method reads double array from user and print it
	 * @param array -Array to read values in
	 * @param rows	-Number of rows
	 * @param cols	-Number of columns
	 */
	public static void getArray(double array[][], int rows, int cols) {
		System.out.println("Enter Array elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				array[i][j] = scanner.nextDouble();
			}
		}
		printArray(array, rows, cols);

	}

	/**This method reads boolean array from user and print it
	 * @param array
	 * @param rows
	 * @param cols
	 */
	public static void getArray(boolean array[][], int rows, int cols) {
		System.out.println("Enter Array elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				array[i][j] = scanner.nextBoolean();
			}
		}
		printArray(array, rows, cols);

	}
	
	/**This method Prints given array
	 * @param array
	 */
	public static <T> void printArray(T array[][]) {
		System.out.println("==Array==");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				out.print(array[i][j] + " ");
			}
			out.println();
		}

	}

	/**This method prints given array
	 * @param array
	 * @param rows
	 * @param cols
	 */
	public static void printArray(int array[][], int rows, int cols) {
		System.out.println("==Array==");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				out.print(array[i][j] + " ");
			}
			out.println();
		}

	}

	/**This method prints given array 
	 * @param array
	 * @param rows
	 * @param cols
	 */
	public static void printArray(double array[][], int rows, int cols) {

		if (array.length > 0) {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					out.print(array[i][j] + " ");
				}
				out.println();
			}
		}
	}

	/**This method prints given array 
	 * @param array
	 * @param rows
	 * @param cols
	 */
	public static void printArray(boolean array[][], int rows, int cols) {

		if (array.length > 0) {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					out.print(array[i][j] + " ");
				}
				out.println();
			}
		}
	}

	/**This method find and prints triplets whose addition is zero 
	 * @param array
	 */
	public static void findDistinctTriplets(int array[]) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if ((array[i] + array[j] + array[k]) == 0) {
						System.out.println(array[i] + " " + array[j] + " "
								+ array[k]);
						count++;
					}
				}
			}
		}
		System.out.println("The number of such distinct triplet pairs are = "
				+ count);
	}

	
	public static void stopwatchSimulator() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			
		}
		long stopTime = System.currentTimeMillis();
		long Time = stopTime - startTime;
		System.out.println("Total time required" + Time);
	}
	
	/**This method start tic tac toe game
	 * @return - final result String
	 */
	public static String ticTacToe() {
		boolean userTurn = false;
		int gameArray[][] = new int[3][3];
		int row, cols;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				gameArray[i][j] = -1;
			}
		}
		for (int k = 0; k < 9; k++) {

			if (userTurn) {
				userTurn(gameArray);
				userTurn = false;
				printGameArray(gameArray);
				if (checkWin(gameArray, 0)) {
					return "You Won";
				}

			} else {
				System.out.println("Computer's Turn");
				computerTurn(gameArray);
				userTurn = true;
				printGameArray(gameArray);
				if (checkWin(gameArray, 1)) {
					return "Computer Won";
				}

			}

		}

		return "Match Draw";
	}

	private static void printGameArray(int[][] gameArray) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (gameArray[i][j] == 0) {
					System.out.print("| X |");
				} else if (gameArray[i][j] == 1) {
					System.out.print("| O |");
				} else {
					System.out.print("|   |");
				}
			}
			System.out.println();
			System.out.println("===============");
		}

	}

	private static void computerTurn(int[][] gameArray) {

		Random random = new Random();
		int row = random.nextInt(3);
		int cols = random.nextInt(3);
		if (isValidTurn(gameArray, row, cols)) {
			gameArray[row][cols] = 1;
		} else {
			computerTurn(gameArray);
		}

	}

	private static boolean checkWin(int[][] gameArray, int i) {
		for (int j = 0; j < 3; j++) {
			if (gameArray[j][0] == i && gameArray[j][1] == i
					&& gameArray[j][2] == i) {
				return true;
			}
			if (gameArray[0][j] == i && gameArray[1][j] == i
					&& gameArray[2][j] == i) {
				return true;
			}
		}
		if (gameArray[0][0] == i && gameArray[1][1] == i
				&& gameArray[2][2] == i) {
			return true;
		}
		if (gameArray[0][2] == i && gameArray[1][1] == i
				&& gameArray[2][0] == i) {
			return true;
		}
		return false;
	}

	private static void userTurn(int[][] gameArray) {
		System.out.println("Your Turn....");
		System.out.println("Enter Position");
		System.out.print("Row=");
		int row = scanner.nextInt() - 1;
		System.out.print("Column=");
		int cols = scanner.nextInt() - 1;
		if (isValidTurn(gameArray, row, cols)) {
			gameArray[row][cols] = 0;
		} else {
			userTurn(gameArray);
		}

	}

	private static boolean isValidTurn(int[][] gameArray, int row, int cols) {
		if (gameArray[row][cols] == -1) {
			return true;
		}
		return false;
	}
	/**This adds all possible permutaions in combinations
	 * @param word        
	 * @param combinations
	 * @param startIndex
	 * @param endIndex
	 */
	public static void stringPermutations(char[] word,ArrayList combinations,int startIndex,int endIndex) {
		if(startIndex==endIndex) {
			combinations.add(String.valueOf(word));
		}	
		else {
			for(int i=startIndex;i<=endIndex;i++) {
				swap(word,startIndex,i);
				stringPermutations( word,combinations, startIndex+1, endIndex);
				swap(word,startIndex,i);
			}
		}
	}

	public static void swap(char[] array,int i,int j) {
		char temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		
	}
}
