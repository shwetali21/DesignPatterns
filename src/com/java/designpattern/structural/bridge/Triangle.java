package com.java.designpattern.structural.bridge;

/**Concrete class of Shape interface which utilizes method from Color interface as well.
 */
public class Triangle extends Shape {
	public Triangle(Color color) {
		super(color);
	}

	@Override
	public String draw() {
		return "Triangle drawn. " + color.fill();
	}
}
