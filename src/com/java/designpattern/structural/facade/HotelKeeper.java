package com.java.designpattern.structural.facade;

/**Class HotelKeeper - the facade.
 * It is clear that the complex implementation will be done by HotelKeeper.
 * */
public class HotelKeeper { 

	public VegMenu getVegMenu() { 
		VegRestaurant veg = new VegRestaurant(); 
		return (VegMenu)veg.getMenus(); 
	} 

	public NonVegMenu getNonVegMenu() { 
		NonVegRestaurant nonVeg = new NonVegRestaurant(); 
		return (NonVegMenu)nonVeg.getMenus(); 
	} 
} 
