package com.bridgelabz.utility;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
	static Scanner scanner = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(
			new OutputStreamWriter(System.out), true);
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

	public static void printPowerOfTwo(int number) {
		double ans;
		for (int power = 0; power <= number; power++) {
			ans = Math.pow(2, power);
			System.out.println(power + " " + ans);
		}
	}

	public static double getHarmonicNumber(int number) {
		double hNumber = 0.0;
		for (float i = 1; i <= number; i++) {
			hNumber += (1 / i);
		}
		return hNumber;
	}

	public static void gamblerSimulator(int stake, int goal, int trials) {
		int bets = 0;
		int wins = 0;

		for (int t = 0; t < trials; t++) {
			int cash = stake;
			bets++;
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
		System.out.println(wins + " wins out of " + bets);
		System.out.println("Percent of games won = " + 100.0 * wins / trials);

	}

	public static void generateCoupon(int nRandoms) {
		int randomCount = 1, randomNo, flag = 0, index = 1;
		int a[] = new int[nRandoms];
		a[0] = (int) (nRandoms * Math.random());
		while (index < nRandoms) {
			randomNo = (int) (Math.random() * nRandoms);
			randomCount++;
			for (int j = 0; j < index; j++) {
				if (a[j] == randomNo) {
					flag = 1;
				}
			}
			if (flag == 0) {
				a[index] = randomNo;
				index++;
			}
			flag = 0;
		}
		System.out.println(randomCount);
		for (int i : a) {
			System.out.println(i);
		}

	}

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

	public static double getDistance(int xPoint, int yPoint) {
		double distance = Math.sqrt(Math.pow(xPoint, 2) + Math.pow(yPoint, 2));
		return distance;
	}

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

	public static double getWindChill(double temprature, double windspeed) {
		double windChill;
		windChill = 35.74 + 0.6215 * temprature + (0.4275 * temprature - 35.75)
				* Math.pow(windspeed, 0.16);
		return windChill;
	}

	public static void getArray(int array[][], int rows, int cols) {
		System.out.println("Enter Array elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		printArray(array, rows, cols);

	}

	public static void getArray(double array[][], int rows, int cols) {
		System.out.println("Enter Array elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				array[i][j] = scanner.nextDouble();
			}
		}
		printArray(array, rows, cols);

	}

	public static void getArray(boolean array[][], int rows, int cols) {
		System.out.println("Enter Array elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				array[i][j] = scanner.nextBoolean();
			}
		}
		printArray(array, rows, cols);

	}
	public static <T> void printArray(T array[][]) {
		System.out.println("==Array==");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				out.print(array[i][j] + " ");
			}
			out.println();
		}

	}
	public static void printArray(int array[][], int rows, int cols) {
		System.out.println("==Array==");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				out.print(array[i][j] + " ");
			}
			out.println();
		}

	}

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
		for (int i = 0; i < 10000000; i++) {
			scanner=new Scanner(System.in);
		}
		long stopTime = System.currentTimeMillis();
		long Time = stopTime - startTime;
		System.out.println("Total time required" + Time);
	}

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

}