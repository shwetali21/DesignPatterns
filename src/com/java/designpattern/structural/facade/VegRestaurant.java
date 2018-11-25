package com.java.designpattern.structural.facade;

/**The Restaurant are of two types and can implement the hotel interface.*/
public class VegRestaurant implements Hotel { 

	public Menus getMenus() { 
		return new VegMenu(); 
	} 
} 
