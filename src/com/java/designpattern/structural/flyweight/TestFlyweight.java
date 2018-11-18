package com.java.designpattern.structural.flyweight;

import java.util.Random;

public class TestFlyweight {
	
	private static final String[] colors = { "Red", "Green", "Blue", "White", "Black" };
	public static void main(String[] args) {

		for(int i = 0; i < 5; ++i) {
			Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}
	
	private static String getRandomColor() {
		return colors[(int)(Math.random()*colors.length)];
	}
	
	private static int getRandomX() {
		return new Random().nextInt();
	}
	
	private static int getRandomY() {
		return new Random().nextInt();
	}
}
