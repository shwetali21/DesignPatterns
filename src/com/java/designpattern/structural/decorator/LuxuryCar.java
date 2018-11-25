package com.java.designpattern.structural.decorator;

/**Concrete Decorators – Extending the base decorator functionality and modifying the component behavior accordingly.
 * LuxuryCar extending from BaseDecorator - CarDecorator.
 * */
public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.print("Adding features of Luxury Car.");
	}
}
