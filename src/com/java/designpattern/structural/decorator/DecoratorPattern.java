package com.java.designpattern.structural.decorator;

//client program that can create different kinds of Object at runtime and they can specify the order of execution too.
public class DecoratorPattern {

	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");

		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}
}
