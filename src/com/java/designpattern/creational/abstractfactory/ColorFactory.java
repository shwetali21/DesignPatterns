package com.java.designpattern.creational.abstractfactory;

public class ColorFactory implements AbstractFactory {

	@Override
	public Color getColor(String colorType) {
		if ("White".equalsIgnoreCase(colorType)) {
			return new White();
		} else if ("Blue".equalsIgnoreCase(colorType)) {
			return new Brown();
		}

		return null;
	}

	@Override
	public Animal getAnimal(String animalType) {
		return null;
	}

}
