package com.maicolAntali.menu;

import com.maicolAntali.inputOutput.IntReader;

public class ChoiceMenu {
	
	private static final String EDGE = "*******************************************";
	private static final String EXIT = "0 \tExit the menu";
	private static final String TEXT = "Type the number of your choice --> ";
	
	private final String title;
	private final String [] items;
	
	
	public ChoiceMenu(String title, String [] items) {
		this.title = title;
		this.items = items;
	}
	
	/**
	 * Print menu
	 */
	public void menuPrinter() {
		System.out.println(EDGE);
		System.out.println(title);
		System.out.println(EDGE);
		
		for (int i = 0; i < items.length; i++) {
			System.out.println(i+1 + "\t" + items[i]);
		}
		System.out.println("\n" + EXIT + "\n");
	}
	
	/**
	 * Print menu and acquire a choice
	 * @return number of choice (int)
	 */
	public  int menuChoicer() {
		menuPrinter();
		return IntReader.intReaderRange(TEXT, 0, items.length+ 1);
	}
}
