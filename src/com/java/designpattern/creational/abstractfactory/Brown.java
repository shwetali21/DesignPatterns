package com.java.designpattern.creational.abstractfactory;

public class Brown implements Color {

	@Override
	public String getColor() {
		return "Brown";
	}

	@Override
	public String getShade() {
		return "coffee";
	}
	
	@Override
	public String toString() {
		return "Brown [Color()=" + getColor() + ", Shade()=" + getShade() + ", Class()=" + getClass() + "]";
	}
}
