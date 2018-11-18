package com.java.designpattern.structural.bridge;

public class BridgePattern {
	public static void main(String[] args) {
		//a square with red color
		Shape square = new Square(new Red());
		System.out.println(square.draw());
		Triangle triangle = new Triangle(new Blue());
		System.out.println(triangle.draw());
	}
}
