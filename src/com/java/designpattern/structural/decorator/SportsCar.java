package com.java.designpattern.structural.decorator;

/**Concrete Decorators – Extending the base decorator functionality and modifying the component behavior accordingly.
 * SportsCar extending from BaseDecorator - CarDecorator.
 * */
public class SportsCar extends CarDecorator {

	public SportsCar(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.print("Adding features of Sports Car.");
	}
}
