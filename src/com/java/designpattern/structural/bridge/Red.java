package com.java.designpattern.structural.bridge;

/**Concrete class of Color interface.*/
public class Red implements Color {
	
	@Override
	public String fill() {
		 return "Color is Red";
	}
}
