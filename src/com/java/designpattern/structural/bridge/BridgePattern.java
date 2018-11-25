package com.java.designpattern.structural.bridge;

/**Using Bridge pattern and passing the desired color object.
 * */
public class BridgePattern {

	public static void main(String[] args) {
		
		//a square with red color
		Shape square = new Square(new Red());
		System.out.println(square.draw());
		
		//a triangle with blue color
		Triangle triangle = new Triangle(new Blue());
		System.out.println(triangle.draw());
	}
}
