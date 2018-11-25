package com.java.designpattern.structural.facade;

public class Menus {
}

class NonVegMenu extends Menus {

	String nonVeg;

	public NonVegMenu() {
		nonVeg = "Chicken Handi"; 
	}

	@Override
	public String toString() {
		return "NonVegMenu [nonVeg=" + nonVeg + "]";
	}
}

class VegMenu extends Menus {

	String veg;

	public VegMenu() {
		veg = "Palak Paneer";
	}

	@Override
	public String toString() {
		return "VegMenu [veg=" + veg + "]";
	}
}
