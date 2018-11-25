package com.java.designpattern.structural.bridge;

/**For the Bridge pattern, we’ll consider two layers of abstraction
 * First - Shape.
 * */
public abstract class Shape {
	protected Color color;

	public Shape() {}

	public Shape(Color color) {
		this.color = color;
	}

	public abstract String draw();
}
