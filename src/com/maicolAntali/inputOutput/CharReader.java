package com.maicolAntali.inputOutput;

import java.util.Scanner;

public class CharReader {
	private static final Scanner scan = scannerCreator();
	
	private static final String FORMAT_ERROR = "Error: The entered char isn't in the correct format.";
	private static final String ALLOW_ERROR = "Error: The entered character is not allowed, type an acceptable character:";
	
	/**
	 * Create a scanner object
	 * @return Scanner object
	 */
	private static Scanner scannerCreator() {
		return new Scanner(System.in);
	}
	
	/**
	 * Print a custom text and then acquire a char
	 * @param text Custom text to print
	 * @return Char acquired
	 */
	public static char charReader(String text) {
		boolean exit = false;
		char userChar ='\0';
		
		do {
			System.out.println(text);
			String acquiredChar = scan.next();
			
			if (acquiredChar.length() == 1) {
				exit = true;
				userChar = acquiredChar.charAt(0);
			}
			else {
				System.out.println(FORMAT_ERROR + "\n");
			}
		} while (!exit);
		
		return userChar;
	}
	
	/**
	 * Print a custom text and then acquire a char by checking that it is an allowed char
	 * @param text Custom text to print
	 * @param allowedChar string with allowed char
	 * @return char acquired
	 */
	public static char charReaderAllowed(String text, String allowedChar) {
		boolean exit = false;
		char userChar = '\0';
		
		do {
			userChar = CharReader.charReader(text);
			
			if (allowedChar.indexOf(userChar) != -1) {
				exit = true;
			}
			else {
				System.out.println(ALLOW_ERROR + allowedChar);
			}
		} while (!exit);
		
		return userChar;
	}
}
