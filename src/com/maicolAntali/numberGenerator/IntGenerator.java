package com.maicolAntali.numberGenerator;

import java.util.Random;

public class IntGenerator {
	private static Random random = new Random();
	
	/**
	 * Extracts a random int
	 * @return Random int
	 */
	public static int extracts() {
		return random.nextInt();
	}
	
	/**
	 * Extracts a random int with a Max and Min
	 * @param min Minimum number in the range
	 * @param max Maximum number in the range
	 * @return Random number extracted
	 */
	public static int extractsMaxMin(int min, int max) {
		int range = max + 1 -  min;
		int randomNumber = random.nextInt(range);
		return randomNumber + min;
	}
}
