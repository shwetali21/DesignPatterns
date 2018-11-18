package com.java.designpattern.structural.facade;

public class NonVegRestaurant implements Hotel { 

	public Menus getMenus() { 
		return new NonVegMenu(); 
	} 
} 