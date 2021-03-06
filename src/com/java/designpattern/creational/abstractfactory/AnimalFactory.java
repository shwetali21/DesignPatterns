package com.java.designpattern.creational.abstractfactory;

public class AnimalFactory implements AbstractFactory {

	@Override
	public Animal getAnimal(String animalType) {
		if ("Dog".equalsIgnoreCase(animalType)) {
			return new Dog();
		} else if ("Duck".equalsIgnoreCase(animalType)) {
			return new Duck();
		}

		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}

}
