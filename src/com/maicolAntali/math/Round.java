package com.maicolAntali.math;

public class Round {
	
	/**
	 * Round a double to number with N number after comma
	 * @param number Number to be rounded
	 * @param decimalPlaces number of decimal places which number must have
	 * @return number rounded to N decimal places
	 */
	public  static double round(double number, int decimalPlaces ){
		return Math.round( number * Math.pow( 10, decimalPlaces ) )/Math.pow( 10, decimalPlaces );
	}
}
