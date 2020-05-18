package com.maicolAntali.inputOutput;

import java.util.Scanner;

public class StringReader {
	
	private static final Scanner scan = scannerCreator();
	
	private static final String EMPTY_ERROR = "Error: the string is empty.";
	
	/**
	 * Create a scanner object
	 * @return Scanner object
	 */
	private static Scanner scannerCreator() {
		return new Scanner(System.in);
	}
	
	/**
	 * Print a custom text and then acquire a string
	 * @param text Custom text to print
	 * @return String acquired
	 */
	public static String stringReader(String text) {
		System.out.print(text);
		return scan.next();
	}
	
	/**
	 * Print a custom text and then acquire not empty string
	 * @param text Custom text to print
	 * @return String acquired
	 */
	public static String stringReaderNotEmpty(String text) {
		boolean finito = false;
		String userString = null;
		
		do  {
			userString = StringReader.stringReader(text);
			userString.trim();
			if (userString.length()  > 0 ) {
				finito = true;
			}
			else {
				System.out.println(EMPTY_ERROR + "\n");
			}
		} while (!finito);
		return userString;
	}
}
