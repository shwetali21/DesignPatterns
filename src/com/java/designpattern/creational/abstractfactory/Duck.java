package com.java.designpattern.creational.abstractfactory;

public class Duck implements Animal {

	@Override
	public String getAnimal() {
		return "Duck";
	}

	@Override
	public String makeSound() {
		return "Squeeks";
	}

	@Override
	public String toString() {
		return "Duck [Animal()=" + getAnimal() + ", Sound()=" + makeSound() + ", Class()=" + getClass() + "]";
	}
}