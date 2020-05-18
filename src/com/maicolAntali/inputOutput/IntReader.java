package com.maicolAntali.inputOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntReader {
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
	 * Print a custom text and then acquire an int
	 * @param text Custom text to print
	 * @return Int acquired
	 */
	public static int intReader(String text) {
		boolean exit = false;
		int userValue = 0;
		
		do {
			System.out.print(text);
			try {
				userValue = scan.nextInt();
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
	 * Print a custom text and then acquire an int with minimum
	 * @param text Custom text to print
	 * @param minimum Int minimum to acquire
	 * @return Int acquired
	 */
	public static int intReaderMinimum(String text, int minimum) {
		boolean exit = false;
		int userValue = 0;
		
		do {
			userValue = IntReader.intReader(text);
			
			if(userValue >= minimum) {
				exit = true;
			}
			else {
				System.out.println(MAXIMUM_ERROR + minimum);
			}
		} while (!exit);
		
		return userValue;
	}
	
	/**
	 * Print a custom text and then acquire an int with maximum
	 * @param text Custom text to print
	 * @param maximum Int maximum to acquire
	 * @return Int acquired
	 */
	public static int intReaderMaximum(String text, int maximum) {
		boolean exit = false;
		int userValue = 0;
		
		do {
			userValue = IntReader.intReader(text);
			
			if(userValue <= maximum) {
				exit = true;
			}
			else {
				System.out.println(MINIMUM_ERROR + maximum);
			}
		} while (!exit);
		
		return userValue;
	}
	
	/**
	 * Print a custom text and then acquire a positive int
	 * @param text Custom text to print
	 * @return Int acquired
	 */
	public static int intReaderPositive(String text) {
		return IntReader.intReaderMinimum(text, 0);
	}
	
	/**
	 * Print a custom text and then acquire a negative int
	 * @param text Custom text to print
	 * @return Int acquired
	 */
	public static int intReaderNegative(String text) {
		return IntReader.intReaderMaximum(text, 0);
	}
	
	/**
	 * Print a custom text and then acquire an int in a specific range
	 * @param text Custom text to print
	 * @param minimum Minimum int in the range
	 * @param maximum Maximum int in the range
	 * @return Int acquired
	 */
	public static int intReaderRange(String text, int minimum, int maximum) {
		boolean exit = false;
		int userValue = 0;
		
		do {
			userValue = intReader(text);
			
			if(userValue >= minimum && userValue <= maximum) {
				exit = true;
			}
			else {
				if(userValue > maximum) {
					System.out.println(MINIMUM_ERROR);
				}
				if (userValue < minimum) {
					System.out.println(MAXIMUM_ERROR);
				}
			}
		} while (!exit);
		
		return userValue;
	}
}
