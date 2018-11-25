package com.java.designpattern.structural.bridge;

/**Concrete class of Shape interface which utilizes method from Color interface as well.*/
public class Square extends Shape {
	public Square(Color color) {
		super(color);
	}

	@Override
	public String draw() {
		return "Square drawn. " + color.fill();
	}
}
