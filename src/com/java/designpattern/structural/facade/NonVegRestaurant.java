package com.java.designpattern.structural.facade;

/**The Restaurant are of two types and can implement the hotel interface.*/
public class NonVegRestaurant implements Hotel { 

	public Menus getMenus() { 
		return new NonVegMenu(); 
	} 
} 