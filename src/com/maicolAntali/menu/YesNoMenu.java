package com.maicolAntali.menu;

public class YesNoMenu extends ChoiceMenu{
	
	private static final String[] items = {"Yes", "No"} ;
	
	/**
	 * Constructor for create a menu with preselected items
	 * @param title Title of menu
	 */
	public YesNoMenu(String title) {
		super(title, items);
	}
}
