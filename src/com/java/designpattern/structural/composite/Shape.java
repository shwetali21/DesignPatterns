package com.java.designpattern.structural.composite;

/**The Base Component:
 * Composite pattern base component defines the common methods for leaf and composites. 
 * Class Shape with a method draw(String fillColor) to draw the shape with given color.
 */
public interface Shape {
	void draw(String fillColor);
}