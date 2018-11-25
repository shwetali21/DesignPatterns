package com.java.designpattern.structural.composite;

/**Leafs:
 * These are the building block for the composite.
 * We can create multiple leaf objects such as Triangle, Circle etc.
 */
public class Circle implements Shape {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Circle with color " + fillColor);
	}
}
