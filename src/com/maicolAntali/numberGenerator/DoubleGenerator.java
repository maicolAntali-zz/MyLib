package com.maicolAntali.numberGenerator;

import java.util.Random;

public class DoubleGenerator {
	private static Random random = new Random();
	
	/**
	 * Extracts a random double
	 * @return Random int
	 */
	public static double extract() {
		return random.nextDouble();
	}
}
