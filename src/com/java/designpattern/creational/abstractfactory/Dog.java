package com.java.designpattern.creational.abstractfactory;

public class Dog implements Animal {

	@Override
	public String getAnimal() {
		return "Dog";
	}

	@Override
	public String makeSound() {
		return "Barks";
	}

	@Override
	public String toString() {
		return "Dog [Animal()=" + getAnimal() + ", Sound()=" + makeSound() + ", Class()=" + getClass() + "]";
	}

}
