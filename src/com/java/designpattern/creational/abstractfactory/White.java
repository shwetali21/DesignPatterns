package com.java.designpattern.creational.abstractfactory;

public class White implements Color {

	@Override
	public String getColor() {
		return "White";
	}

	@Override
	public String getShade() {
		return "Bright";
	}

	@Override
	public String toString() {
		return "White [Color()=" + getColor() + ", Shade()=" + getShade() + ", Class()=" + getClass() + "]";
	}

	
}
