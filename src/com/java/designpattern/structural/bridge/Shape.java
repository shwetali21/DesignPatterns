package com.java.designpattern.structural.bridge;

public abstract class Shape {
	protected Color color;

	public Shape() {}
	
	public Shape(Color color) {
		this.color = color;
	}

	public abstract String draw();
}
