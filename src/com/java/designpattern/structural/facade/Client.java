package com.java.designpattern.structural.facade;

/**The client will just access the HotelKeeper and ask for either Veg or NonVeg menu.
 * */
public class Client { 

	public static void main (String[] args) { 
		HotelKeeper keeper = new HotelKeeper(); 

		VegMenu veg = keeper.getVegMenu(); 
		NonVegMenu nonVeg = keeper.getNonVegMenu(); 

		System.out.println(veg.toString());
		System.out.println(nonVeg.toString());
	} 
} 