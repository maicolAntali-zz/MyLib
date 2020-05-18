package com.maicolAntali.search;

import java.util.ArrayList;

public class ArrayListSearch {
	
	/**
	 * Search for a specific string in a ArrayList
	 * @param list Arraylist in which to search for the string
	 * @param toSearch The string to search for in the Arraylist
	 * @return The position of the string, if it does not find the string returns -1
	 */
	public static int arrayListSearchString(ArrayList<String> list, String toSearch) {
		boolean found = false;
		int pos = 0;
		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i);
			//ignore the case sensitive of the Strings
			if(text.toLowerCase().equals(toSearch.toLowerCase())) {
				found = true;
				pos = i;
			}
		}
		if (found) {
			return pos;
		}
		else {
			return -1;
		}
	}
}
