package com.java.designpattern.behavioral.templatemethod;

//Template Method Concrete Classes
public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls.");		
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with Wooden coating.");
	}
}
