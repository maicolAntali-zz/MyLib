package com.maicolAntali.inputOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleReader {
	private static final Scanner scan = scannerCreator();
	
	private static final String FORMAT_ERROR = "Error: The entered value isn't in the correct format.";
	private static final String MAXIMUM_ERROR = "Error: Required number must be greater or equal than: ";
	private static final String MINIMUM_ERROR = "Error: Required number must be less or equal than: ";
	
	/**
	 * Create a scanner object
	 * @return Scanner object
	 */
	private static Scanner scannerCreator() {
		return new Scanner(System.in);
	}
	
	/**
	 * Print a custom text and then acquire a double
	 * @param text Custom text to print
	 * @return Double acquired
	 */
	public static double doubleReader(String text) {
		boolean exit = false;
		double userValue = 0;
		
		do {
			System.out.print(text);
			try {
				userValue = scan.nextDouble();
				exit = true;
			}
			catch (InputMismatchException e){
				System.out.println(FORMAT_ERROR + "\n");
				scan.next();
			}
		} while(!exit);
		return userValue;
	}
	
	/**
	 * Print a custom text and then acquire a double with minimum
	 * @param text Custom text to print
	 * @param minimum Double minimum to acquire
	 * @return Double acquired
	 */
	public static double doubleReaderMinimum(String text, double minimum) {
		boolean exit = false;
		double userValue;
		
		do {
			userValue = DoubleReader.doubleReader(text);
			
			if(userValue >= minimum) {
				exit = true;
			}
			else {
				System.out.println(MINIMUM_ERROR + minimum);
			}
		} while (!exit);
		
		return userValue;
	}
	
	/**
	 * Print a custom text and then acquire a double with maximum
	 * @param text Custom text to print
	 * @param maximum Double maximum to acquire
	 * @return Double acquired
	 */
	public static double doubleReaderMaximum(String text, double maximum) {
		boolean exit = false;
		double userValue;
		
		do {
			userValue = DoubleReader.doubleReader(text);
			
			if(userValue <= maximum) {
				exit = true;
			}
			else {
				System.out.println(MAXIMUM_ERROR + maximum);
			}
		} while (!exit);
		
		return userValue;
	}
	
	/**
	 * Print a custom text and then acquire a positive double
	 * @param text Custom text to print
	 * @return Double acquired
	 */
	public static double doubleReaderPositive(String text) {
		return DoubleReader.doubleReaderMinimum(text, 0);
	}
	
	/**
	 * Print a custom text and then acquire a negative double
	 * @param text Custom text to print
	 * @return Double acquired
	 */
	public static double doubleReaderNegative(String text) {
		return DoubleReader.doubleReaderMaximum(text, 0);
	}
	
	/**
	 * Print a custom text and then acquire a double in a specific range
	 * @param text Custom text to print
	 * @param minimum Minimum double in the range
	 * @param maximum Maximum double in the range
	 * @return double acquired
	 */
	public static double doubleReaderRange(String text, double minimum, double maximum) {
		boolean exit = false;
		double userValue;
		
		do {
			userValue = doubleReader(text);
			
			if(userValue >= minimum && userValue <= maximum) {
				exit = true;
			}
			else {
				if(userValue > maximum) {
					System.out.println(MAXIMUM_ERROR);
				}
				if (userValue < minimum) {
					System.out.println(MINIMUM_ERROR);
				}
			}
		} while (!exit);
		
		return userValue;
	}
}
